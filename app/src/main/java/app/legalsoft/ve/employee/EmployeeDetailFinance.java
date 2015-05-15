package app.legalsoft.ve.employee;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.legalsoft.ve.R;
import app.legalsoft.ve.model.EmployeeModel;

/**
 * Created by Syed.Rahman on 04/05/2015.
 */
public class EmployeeDetailFinance extends Fragment {

    TextView tBank;
    TextView tBranch;
    TextView tAccountNo;
    TextView tSalary;
    TextView tAllowance;

    EmployeeModel employeeModel = new EmployeeModel();

    public EmployeeDetailFinance() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_employee_detail_finance, container, false);
        Bundle b = getArguments();

        tBank = (TextView) view.findViewById(R.id.txtBankName);
        tBranch = (TextView) view.findViewById(R.id.txtBranchName);
        tAccountNo = (TextView) view.findViewById(R.id.txtAccountNo);
        tSalary = (TextView) view.findViewById(R.id.txtSalary);
        tAllowance = (TextView) view.findViewById(R.id.txtAllowance);

        employeeModel = employeeModel.fromBundle(b);

        tBank.setText(employeeModel.getBankName());
        tBranch.setText(employeeModel.getBranchName());
        tAccountNo.setText(employeeModel.getAccountNo());
        tSalary.setText(employeeModel.getEmpSalary() + "");
        tAllowance.setText(employeeModel.getEmpAllowance() + "");


        return view;
    }
}
