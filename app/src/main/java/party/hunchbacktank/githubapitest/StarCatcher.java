package party.hunchbacktank.githubapitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import party.hunchbacktank.githubapitest.model.Repository;
import party.hunchbacktank.githubapitest.networking.IRepository;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A login screen that offers login via email/password.
 */
public class StarCatcher extends AppCompatActivity {



    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_REPO = new String[]{
            "arranf", "IsThereAnyDeal"
    };


    // UI references.
    private Button fetchButton;
    private EditText etext_owner;
    private EditText etext_repository;
    private TextView vtext_stars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stars);

        etext_owner = (EditText) findViewById(R.id.inputtext_owner);
        etext_repository = (EditText) findViewById(R.id.inputtext_repository);
        vtext_stars = (TextView) findViewById(R.id.text_stars);
        fetchButton = (Button) findViewById(R.id.fetch_button);
        fetchButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchStars();
            }
        });

    }


    /**
     * Attempts to sign in or register the account specified by the login form.
     * If there are form errors (invalid email, missing fields, etc.), the
     * errors are presented and no actual login attempt is made.
     */
    private void fetchStars() {

        String owner = etext_owner.getText().toString();
        String repository = etext_repository.getText().toString();

        boolean cancel = false;
        View focusView = null;

        // Check if owner is empty
        if (TextUtils.isEmpty(owner)) {
            etext_owner.setError(getString(R.string.error_field_required));
            focusView = etext_owner;
            cancel = true;
        }

        // Check if repository is empty
        if (TextUtils.isEmpty(repository)) {
            etext_repository.setError(getString(R.string.error_field_required));
            focusView = etext_repository;
            cancel = true;
        }

        if (cancel) {

            focusView.requestFocus();
        } else {
            request(owner, repository);

        }
    }

    private void request(String owner, String repository) {
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create());
        Retrofit retrofit = builder.build();

        IRepository repositoryService = retrofit.create(IRepository.class);

        // Asynchronous Call
        Call<Repository> call = repositoryService.getRepo(owner, repository);
        call.enqueue(new Callback<Repository>() {
            @Override
            public void onResponse(Call<Repository> call, Response<Repository> response) {
                Integer stars = response.body().getStargazersCount();
                vtext_stars.setText(stars.toString() + " have starred");
                vtext_stars.setVisibility(View.VISIBLE);

            }

            @Override
            public void onFailure(Call<Repository> call, Throwable t) {

            }

        });

    }

}

