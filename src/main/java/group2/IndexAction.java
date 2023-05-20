package group2;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;


public class IndexAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

}
