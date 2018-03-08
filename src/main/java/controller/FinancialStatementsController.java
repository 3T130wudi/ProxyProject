package controller;

import biz.CapitalSourceBiz;
import biz.FinancialStatementsBiz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Controller
public class FinancialStatementsController {
    @Resource
    private FinancialStatementsBiz financialStatementsBiz;
    @Resource
    private CapitalSourceBiz capitalSourceBiz;

    @RequestMapping("FinancialStatementsList")
    public String FinancialStatementsList(Model model, @RequestParam(value = "approach_id",required = false) String approach_id,
                                          @RequestParam(value = "apply_date",required = false) String apply_date,
                                          @RequestParam(value = "pass_date",required = false) String pass_date) throws ParseException {
        if(approach_id==null){
            approach_id="0";
        }
        model.addAttribute("FinancialStatements",financialStatementsBiz.selectFinancialStatementsList(Integer.valueOf(approach_id), apply_date, pass_date));
        model.addAttribute("CapitalSource",capitalSourceBiz.selectCapitalSourceList());
        return "FinancialStatementsList";
    }
}
