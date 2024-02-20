// The class Rule-Obj-Activity has 2 aspects.
// This rule therefore has multiple implementation classes.  The code for each one is given below.


// ********** Aspect Action **********

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
import Pega.*;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.*;
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
import com.pegarules.generated.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Rule_Obj_Activity_Code_Security_AppendUserRoles_Action_20231026T132832_144_GMT
        extends com.pega.pegarules.pub.runtime.AbstractActivity implements
        com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport,
        WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
    private static final LogHelper oLog = new LogHelper(
            "Rule_Obj_Activity.AppendUserRoles.Code_Security.Action");

    public Rule_Obj_Activity_Code_Security_AppendUserRoles_Action_20231026T132832_144_GMT(
            PegaAPI aContext) {
        cleanForReuse(aContext);
    }

    public void perform() {
        try {
            pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-SECURITY APPENDUSERROLES #20231026T132832.144 GMT";
            pz_CurrentCircumstance = "0";
            pz_CurrentTraceInfo = oTraceInfo_0;
            if (pega.activityProlog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo)) {
                ClipboardProperty pageRef = null;
                ClipboardProperty nextPage = null;
                java.util.Iterator myPageList = null;
                ClipboardPage thisStepPage = null;
                pz_Dictionary = tools.getThread().getDictionary();

                // Code to call step 1_circum0
                pz_Status = true;
                if (nextBlock.equals("")) {
                    pz_methodStatusUpdated = false;
                    pz_CurrentStepNum = "1";
                    if (oLog.isDebugEnabled()) {
                        oLog.debug("Running step 1_circum0");
                    }
                    ClipboardPage myStepPage = tools.getStepPage();
                    String pz_4 = "OperatorID";
                    thisStepPage = tools.findPage(pz_4, true);
                    PRStackFrame pz_StackFrame1_circum0 = pega
                            .pushStackFrame(
                                    null,
                                    thisStepPage,
                                    false,
                                    false,
                                    PRStackFrame.Type.ACTIVITY_STEP,
                                    "RULE-OBJ-ACTIVITY CODE-SECURITY APPENDUSERROLES #20231026T132832.144 GMT Step: 1 Circum: 0");
                    try {
                        pz_Status = step1_circum0();
                    } finally {
                        pega.popStackFrame(pz_StackFrame1_circum0, false);
                        pz_methodStatusUpdated = true;
                    }
                } // end of if(pz_Status = true and/or nextBlock

                // Code to call step 2_0_circum0
                pz_Status = true;
                if (nextBlock.equals("")) {
                    ClipboardProperty pz_7 = pega.findDataPage(
                            "D_FunctionsByUserID",
                            true,
                            "UserID",
                            scalarValueQuery_1.resolveToString(tools, pega
                                    .findPageWithException("OperatorID",
                                            "Data-Admin-Operator-ID"),
                                    ImmutablePropertyInfo.TYPE_TEXT),
                            "ProgramID",
                            scalarValueQuery_2.resolveToString(tools, pega
                                    .findPageWithException("OperatorID",
                                            "Data-Admin-Operator-ID"),
                                    ImmutablePropertyInfo.TYPE_TEXT))
                            .getIfPresent("pxResults");
                    pageRef = pz_7;
                    if (pageRef != null) {
                        myPageList = pageRef.iterator();
                        while (myPageList.hasNext() && (pz_Status == true)) {
                            forEachCounter++;
                            tools.putParamValue("pyForEachCount",
                                    Integer.toString(forEachCounter));
                            nextPage = (ClipboardProperty) myPageList.next();
                            thisStepPage = nextPage.getPageValue();
                            {
                                if (pz_Status == true && nextBlock.equals("")) {
                                    pz_methodStatusUpdated = false;
                                    pz_CurrentStepNum = "2.0";
                                    if (oLog.isDebugEnabled()) {
                                        oLog.debug("Running step 2_0_circum0");
                                    }
                                    PRStackFrame pz_StackFrame2_0_circum0 = pega
                                            .pushStackFrame(
                                                    null,
                                                    thisStepPage,
                                                    false,
                                                    false,
                                                    PRStackFrame.Type.ACTIVITY_STEP,
                                                    "RULE-OBJ-ACTIVITY CODE-SECURITY APPENDUSERROLES #20231026T132832.144 GMT Step: 2_0 Circum: 0");
                                    try {
                                        pz_Status = step2_0_circum0();
                                    } finally {
                                        pega.popStackFrame(
                                                pz_StackFrame2_0_circum0, false);
                                        pz_methodStatusUpdated = true;
                                    }
                                } // end of if(pz_Status = true and/or nextBlock
                            } // close the if statement for valid class check
                        } // close the for loop for For Each Embedded Page
                    } // close the if statement for pageRef not null
                    forEachCounter = 0;
                    pz_forEachSkipClass = 0;
                } // end of if (nextBlock...

                // Code to call step 3_circum0
                pz_Status = true;
                if (nextBlock.equals("")) {
                    pz_methodStatusUpdated = false;
                    pz_CurrentStepNum = "3";
                    if (oLog.isDebugEnabled()) {
                        oLog.debug("Running step 3_circum0");
                    }
                    ClipboardPage myStepPage = tools.getStepPage();
                    String pz_10 = "OperatorID";
                    thisStepPage = tools.findPage(pz_10, true);
                    PRStackFrame pz_StackFrame3_circum0 = pega
                            .pushStackFrame(
                                    null,
                                    thisStepPage,
                                    false,
                                    false,
                                    PRStackFrame.Type.ACTIVITY_STEP,
                                    "RULE-OBJ-ACTIVITY CODE-SECURITY APPENDUSERROLES #20231026T132832.144 GMT Step: 3 Circum: 0");
                    try {
                        pz_Status = step3_circum0();
                    } finally {
                        pega.popStackFrame(pz_StackFrame3_circum0, false);
                        pz_methodStatusUpdated = true;
                    }
                } // end of if(pz_Status = true and/or nextBlock
            }
        } catch (ActivityTerminateException ate) {
            throw ate; // Terminate all activity processing
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (PRRuntimeException prre) {
            if (!pz_methodStatusUpdated) {
                pega.setThreadPropertyValue(".pxMethodStatus", prre.toString());
            }
            pega.activityStepExceptionHandler(prre, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw prre;
        } catch (RuntimeException re) {
            pega.setThreadPropertyValue(".pxMethodStatus", re.toString());
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pega.activityEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo);
        }
    } // end of perform definition

    public void fuaInit() {
    }

    public void fuaDestroy() {
    }

    public boolean isAllowedInWeb() {
        return isAllowedInWeb;
    }

    private static final String oDependencies[] = {};

    public String[] getUsedRules() {
        return oDependencies;
    }

    private static final DependentRuleInfo[] oDependentRuleInfos = {};

    /**
    * This method returns the set of dependent rules required to build
    * the generated code and (possibly) whole classes that the rules assembler declared.
    * @return array of <code>DependentRuleInfo</code> objects.
    */
    public DependentRuleInfo[] getDependentRuleInfos() {
        return oDependentRuleInfos;
    }

    //	Rules used in this assembly (order and duplicates ARE significant to hash code) :

    /*	 *** Generated for use in a INTRANET Node	*/
    /**
     * provides a stand-in for uniqueness tests for the
     * content of this stream. Created from list of rules
     * and dates listed in the comment above this declaration.
     * @return	32 byte hash of that list using MD5
     */
    public static String getFUAContentHash() {
        return "9d17101d3c7205be20d7589b7b1696ab";
    }

    public String getDefinitionAppliesToClass() {
        return "Code-Security";
    }

    public String getAspect() {
        return "Action";
    }

    /**
     * Step 1 <code>Property-Remove</code> [on page OperatorID] <br>
     */
    public boolean step1_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "Property-Remove");
        try {
            PRStackFrame pz_preStackFrame = pega.pushStackFrame(
                    "Preconditions", null, false, true);
            try { // Preconditions
                pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo,
                        "@LengthOfPageList(.RoleList)&gt;0");
                try {
                    if (myStepPage == null) {
                        throw new InvalidReferenceException(
                                "@LengthOfPageList(.RoleList)>0",
                                "FUAInstance-NullMyStepPage");
                    }
                    boolean pz_5 = ((pega
                            .<Integer> resolveMethodCall(
                                    "LengthOfPageList--(ClipboardProperty)",
                                    "LengthOfPageList", null, null,
                                    new Object[] { myStepPage
                                            .getProperty("RoleList") }))
                            .intValue() > 0);
                    pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo,
                            "@LengthOfPageList(.RoleList)&gt;0", pz_5);
                    if (!pz_5) {
                        // skip step / stop remaining iterations
                        pega.activityStepSkipped("Skip Step / exit remaining iterations");
                        return false;
                    }
                } catch (RuntimeException anyException) {
                    oLog.error("Exception caught while evaluating when",
                            anyException);
                    throw new IndeterminateConditionalException(
                            "@LengthOfPageList(.RoleList)&gt;0 "
                                    + anyException.getMessage(), anyException);
                }
            } finally {
                FUAUtil.activityPreTranIndeterminateConditionalCheck(pega,
                        pz_CheckMessage, pz_preStackFrame);
            }
            final PRStackFrame methodFrame = pega.pushStackFrame(
                    "Property-Remove", null, false, true);
            pz_AttemptedStep = true;
            try { // Method:  Property-Remove
            // Expression: .RoleList
                ClipboardProperty pz_6 = myStepPage.getIfPresent("RoleList");
                try {
                    if (pz_6 != null) {
                        pz_6.removeFromClipboard();
                    }
                } catch (Exception ex) {
                    String strErrMessage = "Exception caught in "
                            + pz_CurrentRuleKey + " at Step 1.";
                    oLog.error(strErrMessage);
                    throw new PRRuntimeException(strErrMessage, ex);
                }
            } finally {
                try {
                    infEngine.forwardChain(tools);
                } finally {
                    pega.unwind(methodFrame, true);
                }
            }
        } catch (ActivityTerminateException ate) {
            throw ate;
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (RuntimeException re) {
            FUAUtil.activityStepStatusUpdateForException(pega, re);
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pz_CurrentStepNum = "1";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",
                    pz_AttemptedStep);
        } // end try block for prolog/epilog
        return pz_StepStat;
    } // end of step1_circum0 definition

    /**
     * Loop through user's functions.
     * <p>
     * Step 2.0 <code>Java</code> [on page D_FunctionsByUserID[UserID:OperatorID.pyUserIdentifier, ProgramID: OperatorID.SelectedProgramID].pxResults] <br>
     */
    public boolean step2_0_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "");
        try {
            final PRStackFrame methodFrame = pega.pushStackFrame("Java", null,
                    false, true);
            pz_AttemptedStep = true;
            try { // Method:  Java

            } finally {
                try {
                    infEngine.forwardChain(tools);
                } finally {
                    pega.unwind(methodFrame, true);
                }
            }
            ClipboardProperty nestedPageRef = null;
            java.util.Iterator myNestedPageList = null;
            ClipboardProperty nextNestedPage = null;
            ClipboardPage nestedStepPage = null;
            ClipboardPage thisStepPage = null;

            // Code to call nested step 2_1_circum0
            pz_Status = true;
            if (nextBlock.equals("")) {
                pz_methodStatusUpdated = false;
                pz_CurrentStepNum = "2.1";
                if (oLog.isDebugEnabled()) {
                    oLog.debug("Running step 2_1_circum0");
                }
                PRStackFrame pz_StackFrame2_1_circum0 = pega
                        .pushStackFrame(
                                null,
                                false,
                                false,
                                PRStackFrame.Type.ACTIVITY_STEP,
                                "RULE-OBJ-ACTIVITY CODE-SECURITY APPENDUSERROLES #20231026T132832.144 GMT Step: 2_1 Circum: 0");
                try {
                    statusReturnedFromNestedLoop = "";
                    pz_Status = step2_1_circum0();
                    if (statusReturnedFromNestedLoop.equals("EXIT_ITER")) {
                        statusReturnedFromNestedLoop = "";
                        return true;
                    }
                } finally {
                    pega.popStackFrame(pz_StackFrame2_1_circum0, false);
                    pz_methodStatusUpdated = true;
                }
            } // end of if(pz_Status = true and/or nextBlock
        } catch (ActivityTerminateException ate) {
            throw ate;
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (RuntimeException re) {
            FUAUtil.activityStepStatusUpdateForException(pega, re);
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pz_CurrentStepNum = "2.0";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum, "",
                    pz_AttemptedStep);
        } // end try block for prolog/epilog
        return pz_StepStat;
    } // end of step2_0_circum0 definition

    /**
     * Append to .RoleList.
     * <p>
     * Step 2.1 <code>Property-Set</code><br>
     */
    public boolean step2_1_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "Property-Set");
        try {
            final PRStackFrame methodFrame = pega.pushStackFrame(
                    "Property-Set", null, false, true);
            pz_AttemptedStep = true;
            try { // Method:  Property-Set
                if (myStepPage == null) {
                    throw new InvalidReferenceException("<code block>",
                            "FUAInstance-NullMyStepPage");
                }
                {
                    pega.setViaPropRef(".RoleList(<append>)", pRef_8, pega
                            .findPageWithException("OperatorID",
                                    "Data-Admin-Operator-ID"),
                            scalarValueQuery_9
                                    .resolveToString(tools, myStepPage,
                                            ImmutablePropertyInfo.TYPE_TEXT),
                            "sTN", false, true);
                }
            } finally {
                try {
                    infEngine.forwardChain(tools);
                } finally {
                    pega.unwind(methodFrame, true);
                }
            }
        } catch (ActivityTerminateException ate) {
            throw ate;
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (RuntimeException re) {
            FUAUtil.activityStepStatusUpdateForException(pega, re);
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pz_CurrentStepNum = "2.1";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",
                    pz_AttemptedStep);
        } // end try block for prolog/epilog
        return pz_StepStat;
    } // end of step2_1_circum0 definition

    /**
     * Insert roles dynamically.
     * <p>
     * Step 3 <code>Java</code> [on page OperatorID] <br>
     */
    public boolean step3_circum0() {
        ClipboardPage myStepPage = tools.getStepPage();
        boolean pz_StepStat = true;
        boolean pz_CheckMessage = true;
        boolean pz_AttemptedStep = false;
        pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo,
                pz_CurrentStepNum, "Java");
        try {
            PRStackFrame pz_preStackFrame = pega.pushStackFrame(
                    "Preconditions", null, false, true);
            try { // Preconditions
                pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo,
                        "@LengthOfPageList(OperatorID.RoleList)&gt;0");
                try {
                    boolean pz_11 = ((pega.<Integer> resolveMethodCall(
                            "LengthOfPageList--(ClipboardProperty)",
                            "LengthOfPageList",
                            null,
                            null,
                            new Object[] { pega.findPageWithException(
                                    "OperatorID", "Data-Admin-Operator-ID")
                                    .getProperty("RoleList") })).intValue() > 0);
                    pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo,
                            "@LengthOfPageList(OperatorID.RoleList)&gt;0",
                            pz_11);
                    if (!pz_11) {
                        // skip step / stop remaining iterations
                        pega.activityStepSkipped("Skip Step / exit remaining iterations");
                        return false;
                    }
                } catch (RuntimeException anyException) {
                    oLog.error("Exception caught while evaluating when",
                            anyException);
                    throw new IndeterminateConditionalException(
                            "@LengthOfPageList(OperatorID.RoleList)&gt;0 "
                                    + anyException.getMessage(), anyException);
                }
            } finally {
                FUAUtil.activityPreTranIndeterminateConditionalCheck(pega,
                        pz_CheckMessage, pz_preStackFrame);
            }
            final PRStackFrame methodFrame = pega.pushStackFrame("Java", null,
                    false, true);
            pz_AttemptedStep = true;
            try { // Method:  Java
                boolean myResult = tools.getAuthorizationHandle().setRoles(
                        tools, PRAuthorization.UPDATE_APPEND,
                        myStepPage.getProperty(".RoleList"));
            } finally {
                try {
                    infEngine.forwardChain(tools);
                } finally {
                    pega.unwind(methodFrame, true);
                }
            }
        } catch (ActivityTerminateException ate) {
            throw ate;
        } catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
            throw arte;
        } catch (RuntimeException re) {
            FUAUtil.activityStepStatusUpdateForException(pega, re);
            pega.activityStepExceptionHandler(re, snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum);
            throw re;
        } finally {
            pz_CurrentStepNum = "3";
            pega.activityStepEpilog(snapshotLocalVariables(),
                    pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",
                    pz_AttemptedStep);
        } // end try block for prolog/epilog
        return pz_StepStat;
    } // end of step3_circum0 definition

    public String nextBlock = "";
    boolean pz_Status = true;
    boolean pz_methodStatusUpdated = false;
    private boolean debugIsOn = false;
    private int forEachCounter = 0;
    private int pz_forEachSkipClass = 0;
    private InfEngUtils infEngine = null;
    ClipboardProperty nextProperty = null;
    String pz_CurrentRuleKey = "";
    String pz_CurrentCircumstance = "";
    String pz_CurrentStepNum = "";
    com.pega.pegarules.priv.tracer.ActivityTraceInfo pz_CurrentTraceInfo = null;
    String pz_thisPageClass = "";
    Dictionary pz_Dictionary = null;
    private static final boolean isAllowedInWeb = true;
    String statusReturnedFromNestedLoop = "";

    public void initializeStandardLocalVariables() {
        nextBlock = "";
        pz_Status = true;
        pz_methodStatusUpdated = false;
        debugIsOn = false;
        forEachCounter = 0;
        pz_forEachSkipClass = 0;
        infEngine = null;
        nextProperty = null;
        pz_CurrentRuleKey = "";
        pz_CurrentCircumstance = "";
        pz_CurrentStepNum = "";
        pz_CurrentTraceInfo = null;
        pz_thisPageClass = "";
        pz_Dictionary = null;
        statusReturnedFromNestedLoop = "";
    }

    public String AG = "";

    public void initializeUserLocalVariables() {
        AG = "";
    }

    public StringMap snapshotLocalVariables() {
        if (!pega.isLocalVariableCollectionEnabled()) {
            return null;
        }

        StringMap smRetVal = new HashStringMap();
        smRetVal.putString(
                "AG",
                (AG == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE
                        : AG.toString());
        return smRetVal;
    }

    public void cleanForReuse(PegaAPI aContext) {
        tools = (PublicAPI) aContext;
        pega = aContext;
        initializeStandardLocalVariables();
        initializeUserLocalVariables();
        infEngine = pega == null ? null : pega.getInfEngUtils();
    }

    public static final String[] pRef_8 = new String[] { "", "", "RoleList",
            "<append>" };
    private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil
            .createQueryBuilder().scalarProperty("SelectedProgramID")
            .buildScalarValueQuery();
    private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil
            .createQueryBuilder().scalarProperty("AccessRoleName")
            .buildScalarValueQuery();
    private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil
            .createQueryBuilder().scalarProperty("pyUserIdentifier")
            .buildScalarValueQuery();

    private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo(
            "RULE-OBJ-ACTIVITY CODE-SECURITY APPENDUSERROLES #20231026T132832.144 GMT",
            "Code-Security AppendUserRoles", "EPC", "02-02-23", false, true,
            "", "UTILITY", "20231026T132832.144 GMT", "Rule-Obj-Activity");
}
