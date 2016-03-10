package dti.pm.core.http;

/**
 * Common ePolicy Request parameter and attribute names.
 * <p/>
 * <p>(C) 2003 Delphi Technology, inc. (dti)</p>
 * Date:   Jul 19, 2006
 *
 * @author wreeder
 */
/*
 *
 * Revision Date    Revised By  Description
 * ---------------------------------------------------
 * 07/09/2007       sxm         Added RISK_ID, COVERAGE_ID, and COVERAGE_CLASS_ID
 * 08/23/2007       sxm         Added POLICY_LIST
 * 08/31/2007       Mark        Added TRANSACTION_ID,TERM_BASE_RECORD_ID,POLICY_ID
 * 01/19/2011       wfu         Added IS_FROM_COPY_NEW for issue 113566.
 * 02/22/2011       wfu         Added IS_TRIGGER_FORMS for issue 113063.
 * 04/06/2011       fcb         119324: added isNewPolicyCreated
 * 06/10/2011       wqfu        103799 - Added ENTITY_ID, IS_COPY_ACTS_STATS
 * 06/27/2013       ryzhao      136202 - Added IS_ACCOUNT_TYPE_CREATED
 * 07/04/2013       ryzhao      145887 - Added REFRESH_PARENT_PAGE_AFTER_CLOSE.
 * 04/28/2015       wfu         162799 - Added WORK_FLOW_PARAM.
 * 03/10/2016       rsr         xyz  
 * ---------------------------------------------------
 */
public interface RequestIds extends dti.oasis.http.RequestIds {

    public final static String POLICY_NO = "policyNo";
    public final static String POLICY_HEADER = "policyHeader";
    public final static String POLICY_TERM_HISTORY_ID = "policyTermHistoryId";
    public final static String POLICY_VIEW_MODE = "policyViewMode";
    public final static String SELECTED_POLICY_VIEW_MODE = "selectedPolicyViewMode";
    public final static String IS_POLICY_VIEW_MODE_VISIBLE = "isPolicyViewModeVisible";
    public final static String POLICY_SEARCH_MAX_ROWS = "PolicySearchMaximumRows"; // max rows to return per sys config
    public final static String POLICY_SEARCH_TOTAL_ROWS ="PolicySeachTotalRows";  // how many returned
    public final static String SAVE_INPROGRESS ="ProceedToken";  // Indicator for save in-progress    
    public final static String INITIAL_VALUES = "initialValues";
    public static final String RISK_ID = "riskId";
    public static final String COVERAGE_ID = "coverageId";
    public static final String COVERAGE_CLASS_ID = "coverageClassId";
    public static final String TRANSACTION_ID = "transactionId";
    public static final String TERM_BASE_RECORD_ID = "termBaseRecordId";
    public static final String POLICY_ID = "policyId";
    public static final String WORKFLOW_FOR = "workflowFor";
    public static final String IS_FROM_COPY_NEW = "isFromCopyNew";  // to determine if invoke from copy new
    public static final String IS_TRIGGER_FORMS = "isTriggerForms";  // to determine if invoke forms trigger 
    public static final String IS_NEW_POLICY_CREATED = "isNewPolicyCreated";
    public static final String ENTITY_ID = "entityId";
    public static final String IS_COPY_ACTS_STATS = "isCopyActsStats"; // to determine if invoke from prior acts copy
    public static final String IS_ACCOUNT_TYPE_CREATED = "isAccountTypeCreated";
    public static final String WORK_FLOW_PARAM = "workFlowParam";
    public static final String REFRESH_PARENT_PAGE_AFTER_CLOSE = "refreshParentPageAfterClose";
    public final static String WATCH_LIST_HISTORY_SEARCH_MAX_ROWS = "WatchListHistorySearchMaximumRows"; // max rows to return per sys config
    public final static String WATCH_LIST_HISTORY_SEARCH_TOTAL_ROWS ="WatchListHistorySearchTotalRows";  // how many returned
}
