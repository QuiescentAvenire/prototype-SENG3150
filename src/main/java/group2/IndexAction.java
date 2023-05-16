package group2;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {

    private String name;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
