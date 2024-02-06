package com.pegarules.generated.testgen;

/*
 * Copyright (c) 2024 Pegasystems Inc.
 * All rights reserved.
 *
 * This software is governed by a License Agreement that restricts its
 * use.  The software contains valuable trade secrets and proprietary
 * information of Pegasystems Inc and is protected by federal copyright
 * law.  It may not be copied, modified, translated or distributed in any
 * form or medium, disclosed to third parties or used in any manner not
 * expressly provided for in said License Agreement except with written
 * authorization from Pegasystems Inc.
 */
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.infengine.*;
import com.pega.pegarules.pub.presence.*;
import com.pega.pegarules.pub.runtime.*;
import com.pega.pegarules.pub.services.*;
import com.pega.pegarules.pub.util.*;
import com.pega.platform.clipboard.query.PageListQuery;
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.PropertyQuery;
import com.pega.platform.clipboard.query.ScalarListQuery;
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.executionengine.runtime.Loadtime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Rule_Obj_Report_Definition_Data_Admin_Operator_ID_DeactivatedUsersInLast6Months_Action_20240124T133305_285_GMT
        extends com.pega.pegarules.priv.AbstractFUASupport implements Activity,
        FUASupport {
    private static final LogHelper oLog = new LogHelper(
            "Rule_Obj_Report_Definition.DeactivatedUsersInLast6Months.Data_Admin_Operator_ID.Action");

    public Rule_Obj_Report_Definition_Data_Admin_Operator_ID_DeactivatedUsersInLast6Months_Action_20240124T133305_285_GMT(
            PegaAPI aContext) {
        tools = aContext;
        pega = aContext;
    }

    public void perform() {
        myStepPage = tools.getStepPage();
        bInitialChaining = pega.isBackwardChaining();

        pega.setBackwardChaining(!bAllowMissingProperties);

        try {
            com.pega.pegarules.priv.tracer.RuleTraceInfo mTraceInfo = oTraceInfo_0;
            if (mTraceInfo != null
                    && pega.isTraceEnabled("Rule Coverage", mTraceInfo)) {
                pega.logTraceEvent("Rule Coverage", "RD Start", "GOOD",
                        mTraceInfo, mTraceInfo.getInsKey(), "BEGIN RD", false,
                        tools.getPrimaryPage(), tools.getStackFrame()
                                .getParameterPage(), null);
            }
            pega.executeReport(myStepPage, tools.getParameterPage());
        } finally {
            pega.setBackwardChaining(bInitialChaining);
        }
    }

    public void fuaInit() {
    }

    public void fuaDestroy() {
    }

    private static final String oDependencies[] = {
            "Rule-Obj-Activity:DOFUASSEMBLY",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODACCESS",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODHEADER",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODCLOSE",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODBODY",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODINIT",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODVERSIONHEADER",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODCALL",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODVERSIONFINISH",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODABSENT",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODCALLVERSION",
            "Rule-Utility-Function:DATAACCESSFUA!DATAACCESSMETHODFINISH" };

    public String[] getUsedRules() {
        return oDependencies;
    }

    private static final DependentRuleInfo[] oDependentRuleInfos = {
            new DependentRuleInfo("DOFUASSEMBLY", "Rule-Obj-Activity", "",
                    true, "Rule-Obj-Report-Definition", "", "", "",
                    "!DOFUASSEMBLY", true, false, "ABSOLUTE_IS_NOT_PRIMARY", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODACCESS",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODACCESS #20180713T132723.107 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODACCESS", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODHEADER",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODHEADER #20180713T132723.127 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODHEADER", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODCLOSE",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODCLOSE #20180713T132723.120 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODCLOSE", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODBODY",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-03-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODBODY #20190130T075229.733 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODBODY", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODINIT",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODINIT #20180713T132723.131 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODINIT", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODVERSIONHEADER",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODVERSIONHEADER #20180713T132723.137 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODVERSIONHEADER", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODCALL",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODCALL #20180713T132723.113 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODCALL", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODVERSIONFINISH",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODVERSIONFINISH #20180713T132723.134 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODVERSIONFINISH", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODABSENT",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODABSENT #20180713T132723.103 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODABSENT", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODCALLVERSION",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODCALLVERSION #20180713T132723.116 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODCALLVERSION", true, false,
                    "ABSOLUTE_CLASSLESS", 1),
            new DependentRuleInfo(
                    "DATAACCESSFUA!DATAACCESSMETHODFINISH",
                    "Rule-Utility-Function",
                    "",
                    false,
                    "",
                    "Pega-RulesEngine",
                    "08-01-01",
                    "RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODFINISH #20180713T132723.124 GMT",
                    "DATAACCESSFUA!DATAACCESSMETHODFINISH", true, false,
                    "ABSOLUTE_CLASSLESS", 1) };

    /**
    * This method returns the set of dependent rules required to build
    * the generated code and (possibly) whole classes that the rules assembler declared.
    * @return array of <code>DependentRuleInfo</code> objects.
    */
    public DependentRuleInfo[] getDependentRuleInfos() {
        return oDependentRuleInfos;
    }

    //	Rules used in this assembly (order and duplicates ARE significant to hash code) :
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODABSENT #20180713T132723.103 GMT:20180713T132723.103 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODACCESS #20180713T132723.107 GMT:20180713T132723.107 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODBODY #20190130T075229.733 GMT:20190131T074426.198 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODCALL #20180713T132723.113 GMT:20180713T132723.113 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODFINISH #20180713T132723.124 GMT:20180713T132723.124 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODHEADER #20180713T132723.127 GMT:20180713T132723.127 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODVERSIONHEADER #20180713T132723.137 GMT:20180713T132723.137 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODCALLVERSION #20180713T132723.116 GMT:20180713T132723.116 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODVERSIONFINISH #20180713T132723.134 GMT:20180713T132723.134 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODINIT #20180713T132723.131 GMT:20180713T132723.131 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODCLOSE #20180713T132723.120 GMT:20180713T132723.120 GMT

    //	Functions used during this assembly :
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODBODY #20190130T075229.733 GMT:20190131T074426.198 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODCLOSE #20180713T132723.120 GMT:20180713T132723.120 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODFINISH #20180713T132723.124 GMT:20180713T132723.124 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODHEADER #20180713T132723.127 GMT:20180713T132723.127 GMT
    //	RULE-UTILITY-FUNCTION DATAACCESSFUA DATAACCESSMETHODINIT #20180713T132723.131 GMT:20180713T132723.131 GMT

    /**
     * provides a stand-in for uniqueness tests for the
     * content of this stream. Created from list of rules
     * and dates listed in the comment above this declaration.
     * @return	32 byte hash of that list using MD5
     */
    public static String getFUAContentHash() {
        return "2ae4d40f3705b9cf8483842b7a36e287";
    }

    public String getDefinitionAppliesToClass() {
        return "Data-Admin-Operator-ID";
    }

    public String getAspect() {
        return "Action";
    }

    // Log Property Set Trace for Data Access Event
    void logPropertySetTraceEvent(String sEventType, String sEventName,
            String sRuleSet, String sPropertyName, String sPropertyValue) {
        if (pega.isTraceEnabled(sEventType, sRuleSet)) {
            pega.logTraceEvent(sEventType, sEventName, "", sRuleSet,
                    sPropertyName + " = " + sPropertyValue, "Property-Set",
                    false, tools.getPrimaryPage(), tools.getStackFrame()
                            .getParameterPage(), null);
        }
    }

    private ClipboardPage myStepPage;
    private String mRuleSet;
    private String mRuleHandle;
    private boolean bAllowMissingProperties = false;
    private boolean bInitialChaining;
    private double cellDateValue = 0;

    private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo(
            "RULE-OBJ-REPORT-DEFINITION DATA-ADMIN-OPERATOR-ID DEACTIVATEDUSERSINLAST6MONTHS #20240124T133305.285 GMT",
            "Data-Admin-Operator-ID DeactivatedUsersInLast6Months",
            "SSO_Branch_VDTCP-226", "01-01-01", "20240124T133326.429 GMT");
}
