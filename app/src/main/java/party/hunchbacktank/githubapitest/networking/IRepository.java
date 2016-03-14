package party.hunchbacktank.githubapitest.networking;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Arran on 07/03/2016.
 */
public interface IRepository {
    @GET("/repos/{owner}/{repository}")
    Call<party.hunchbacktank.githubapitest.model.Repository> getRepo(@Path("owner") String owner, @Path("repository") String repository);
}
