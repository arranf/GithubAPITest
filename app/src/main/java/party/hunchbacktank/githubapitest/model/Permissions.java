package party.hunchbacktank.githubapitest.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arran on 07/03/2016.
 */
public class Permissions {

    private Boolean admin;
    private Boolean push;
    private Boolean pull;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The admin
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     *
     * @param admin
     * The admin
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     *
     * @return
     * The push
     */
    public Boolean getPush() {
        return push;
    }

    /**
     *
     * @param push
     * The push
     */
    public void setPush(Boolean push) {
        this.push = push;
    }

    /**
     *
     * @return
     * The pull
     */
    public Boolean getPull() {
        return pull;
    }

    /**
     *
     * @param pull
     * The pull
     */
    public void setPull(Boolean pull) {
        this.pull = pull;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
