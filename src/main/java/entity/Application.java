package entity;

public class Application {
    private  int application_id;
    private  String application_name;
    private  String application_numer;

    public Application() {
    }

    public int getApplication_id() {
        return application_id;
    }

    public void setApplication_id(int application_id) {
        this.application_id = application_id;
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public String getApplication_numer() {
        return application_numer;
    }

    public void setApplication_numer(String application_numer) {
        this.application_numer = application_numer;
    }
}
