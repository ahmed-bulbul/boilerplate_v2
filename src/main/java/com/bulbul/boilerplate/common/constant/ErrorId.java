package com.bulbul.boilerplate.common.constant;

public class ErrorId {
    /**
     * No zero and Negative value allowed
     */
    public static final String ENTER_POSITIVE_VALUE = "rs1001";
    /**
     * Demand id must not be null
     */
    public static final String DEMAND_NO_MUST_NOT_BE_NULL = "item1001";
    /**
     * Demand no already exist
     */
    public static final String DEMAND_NO_ALREADY_EXIST = "item1002";
    /**
     * Store demand id required
     */
    public static final String STORE_DEMAND_ID_REQUIRED = "item1003";
    /**
     * Data not updated
     */
    public static final String DATA_NOT_UPDATED = "item1004";
    /**
     * Code must not be null
     */
    public static final String CODE_MUST_NOT_BE_NULL = "stores1001";

    /**
     * Code already exist
     */
    public static final String CODE_ALREADY_EXIST = "room1001";
    /**
     * Data not saved
     */
    public static final String DATA_NOT_SAVED = "stores1002";
    public static final String DATA_NOT_SAVED_DYNAMIC = "common06";
    /**
     * Stores not found
     */
    public static final String STORES_NOT_EXISTS = "stores1003";
    /**
     * Parent can not change status because of child dependency.
     */
    public static final String PARENT_CAN_NOT_CHANGE_STATUS_BECAUSE_OF_CHILD_DEPENDENCY = "stores1004";
    /**
     * Store id not found
     */
    public static final String STORE_ID_NOT_FOUND = "stores1005";
    /**
     * System error code
     */
    public static final String SYSTEM_ERROR = "a4000";
    /**
     * User not exists.
     */
    public static final String USER_NOT_EXISTS = "a40001";
    /**
     * Role not exists.
     */
    public static final String ROLE_NOT_EXISTS = "a40002";
    /**
     * Id is required.
     */
    public static final String ID_IS_REQUIRED = "a40003";
    public static final String ID_IS_REQUIRED_DYNAMIC = "common05";
    /**
     * User exists with this name.
     */
    public static final String USER_EXISTS_WITH_THIS_NAME = "a40004";
    /**
     * Role is required.
     */
    public static final String ROLE_IS_REQUIRED = "a40005";
    /**
     * Login is required.
     */
    public static final String LOGIN_IS_REQUIRED = "a40006";
    /**
     * Password is required.
     */
    public static final String PASSWORD_IS_REQUIRED = "a40007";
    /**
     * login size should be in between 3 and 20.
     */
    public static final String INVALID_LOGIN_SIZE = "a40008";
    /**
     * Password size should be in between 3 and 20.
     */
    public static final String INVALID_PASSWORD_SIZE = "a40009";
    /**
     * Employee exists with same id.
     */
    public static final String USER_EXISTS_WITH_THIS_EMPLOYEE_ID = "a40035";
    /**
     * Login name already exists
     */
    public static final String LOGIN_NAME_EXISTS = "a40036";

    /*
     * Password doesn't match
     */
    public static final String USER_PASSWORD_DOES_NOT_MATCH = "a40037";
    /**
     * invalid data format exception.
     */
    public static final String INVALID_DATA_FORMAT_EXCEPTION = "a5000";
    /**
     * Invalid jwt token.
     */
    public static final String INVALID_JWT_TOKEN = "a40010";

    /**
     * Role Name already exists
     */
    public static final String ROLE_NAME_ALREADY_EXISTS = "role02";
    /**
     * Role Not saved
     */
    public static final String ROLE_NOT_SAVED = "role03";
    /**
     * role name must not be empty
     */
    public static final String ROLE_NAME_MUST_NOT_BE_EMPTY = "role01";
    /**
     * Role not updated
     */
    public static final String ROLE_NOT_UPDATED = "role04";
    /**
     * Role deletion has failed
     */
    public static final String ROLE_DELETION_HAS_FAILED = "role05";
    /**
     * Role duplication has failed
     */
    public static final String ROLE_DUPLICATION_HAS_FAILED = "role06";
    /**
     * User has no role
     */
    public static final String INVALID_USER = "u1001";
    /**
     * Invalid password pattern.
     */
    public static final String INVALID_PASSWORD_PATTERN = "a40011";
    /**
     * Invalid email pattern.
     */
    public static final String INVALID_EMAIL_PATTERN = "a40012";
    /**
     * Password mismatch with confirmation password.
     */
    public static final String PASSWORD_MISMATCH_WITH_CONFIRMATION_PASSWORD = "a40013";
    /**
     * Access denied
     */
    public static final String ACCESS_DENIED = "ar1001";
    /**
     * Access right required
     */
    public static final String ACCESS_RIGHT_REQUIRED = "ar1002";
    /**
     * Failed to update role access rights
     */
    public static final String FAILED_TO_UPDATE_ROLE_ACCESS_RIGHTS = "r1001";
    /**
     * Failed to save user.
     */
    public static final String FAILED_TO_SAVE_USER = "a40014";
    /**
     * Set of id can't be null or empty
     */
    public static final String INVALID_IDS = "a40015";
    /**
     * Status can't be null.
     */
    public static final String INVALID_TOGGLE_STATUS = "a40016";
    /**
     * Failed to update deleted status.
     */
    public static final String FAILED_TO_UPDATE_DELETED_STATUS = "a40017";
    /**
     * User not exists with this status.
     */
    public static final String USER_NOT_EXISTS_WITH_THIS_DELETED_STATUS = "a40018";
    /**
     * File path not found.
     */
    public static final String FILE_PATH_NOT_FOUND = "fp10001";
    /**
     * Invalid access permission
     */
    public static final String INVALID_ACCESS_PERMISSION = "ac1001";
    /**
     * Token not found.
     */
    public static final String TOKEN_NOT_FOUND = "a40019";

    public static final String DIALING_CODE_EXISTS = "conf01";
    public static final String COUNTRY_NAME_EXISTS = "conf02";
    public static final String COUNTRY_CODE_EXISTS = "conf03";
    public static final String DIALING_CODE_PATTERN = "conf04";

    /**
     * Company name already exist.
     */
    public static final String COMPANY_NAME_ALREADY_EXIST = "com101";
    /**
     * Aircraft model inactive is not possible.
     */
    public static final String AIRCRAFT_MODEL_INACTIVE_IS_NOT_POSSIBLE = "am103";
    /**
     * Aircraft model name already exist.
     */
    public static final String AIRCRAFT_MODEL_NAME_ALREADY_EXIST = "am104";
    /**
     * Aircraft model name should not be empty.
     */
    public static final String AIRCRAFT_MODEL_NAME_SHOULD_NOT_BE_EMPTY = "am105";
    /**
     * Aircraft name should not be empty.
     */
    public static final String AIRCRAFT_MODEL_ID_REQUIRED = "am106";

    public static final String AIRCRAFT_NAME_SHOULD_BE_NOT_EMPTY = "ar100";
    /**
     * Aircraft model should not be empty.
     */
    public static final String AIRCRAFT_MODEL_SHOULD_NOT_BE_EMPTY = "ar101";
    public static final String DATA_NOT_FOUND = "common01";
    public static final String ONLY_TOGGLE_VALUE_ACCEPTED = "common02";
    public static final String NOT_FOUND_DYNAMIC = "common04";
    /**
     * Module name already exist.
     */
    public static final String MODULE_NAME_ALREADY_EXIST = "mod1001";
    /**
     * Module Name is required
     */
    public static final String MODULE_NAME_REQUIRED = "mod1002";
    /**
     * Submodule Name is required
     */
    public static final String SUB_MODULE_NAME_REQUIRED = "mod1003";
    /**
     * Submodule Name already exists
     */
    public static final String SUB_MODULE_NAME_ALREADY_EXIST = "mod1004";
    /**
     * Module ID is required
     */
    public static final String MODULE_ID_REQUIRED = "mod1005";
    /**
     * Module ID is required
     */
    public static final String SUB_MODULE_ID_REQUIRED = "mod1006";
    /**
     * Module order must not be empty
     */
    public static final String MODULE_ORDER_MUST_NOT_BE_EMPTY = "order100";
    /**
     * Submodule order must not be empty
     */
    public static final String SUBMODULE_ORDER_MUST_NOT_BE_EMPTY = "order101";
    /**
     * Submodule item order must not be empty
     */
    public static final String SUBMODULE_ITEM_ORDER_MUST_NOT_BE_EMPTY = "order102";
    /**
     * Base Item ID is required
     */
    public static final String BASE_ITEM_ID_REQUIRED = "itm1001";
    /**
     * Item already exist.
     */
    public static final String ITEM_NAME_ALREADY_EXIST = "itm1002";
    /**
     * Item name is required
     */
    public static final String ITEM_NAME_REQUIRED = "itm1003";
    /**
     * Item has dependency as base item.
     */
    public static final String ITEM_HAS_DEPENDENCY_AS_BASE_ITEM = "itm1004";
    /**
     * Item name is required
     */
    public static final String MODULE_INACTIVE_IS_NOT_POSSIBLE = "mod1007";
    /**
     * Item name is required
     */
    public static final String SUB_MODULE_INACTIVE_IS_NOT_POSSIBLE = "mod1008";
    public static final String ENUM_NOT_FOUND = "enum001";

    public static final String WORK_FLOW_ACTION_NOT_FOUND = "wfa001";
    public static final String APPROVAL_ITEM_ID_REQUIRED = "ai001";
    public static final String EMPLOYEMEE_ID_REQUIRED = "eir001";

    /**
     * Workflow Enum is not valid
     */
    public static final String WORKFLOW_NOT_FOUND = "nts100";
    /**
     * Workflow is required
     */
    public static final String WORK_FLOW_REQUIRED = "nts1001";
    /**
     * Submodule Item ID is required
     */
    public static final String SUBMODULE_ITEM_ID_REQUIRED = "nts1002";
    /**
     * Employee ID is required
     */
    public static final String EMPLOYEE_ID_REQUIRED = "nts1003";

    public static final String LOCATION_CODE_EXISTS = "loc1000";
    public static final String LOCATION_ADDRESS_EXISTS = "loc1001";
    public static final String CITY_ID_REQUIRED = "loc1002";
    public static final String CURRENCY_CODE_EXISTS = "cur001";
    public static final String DEPARTMENT_NAME_EXISTS = "department001";
    public static final String SECTION_NAME_UNDER_THIS_DEPARTMENT_ALREADY_EXIST = "section001";
    /**
     * Manufacture name is required
     */
    public static final String NAME_IS_REQUIRED = "man1009";

    /**
     * Country origin ID is not found
     */
    public static final String COUNTRY_ORIGIN_NOT_FOUND = "man1011";

    /**
     * City ID is not found
     */
    public static final String CITY_ID_NOT_FOUND = "man1010";

    /**
     * Airport name must not be empty
     */
    public static final String AIRPORT_NAME_MUST_NOT_BE_EMPTY = "airport_01";
    /**
     * Iata code must not be empty
     */
    public static final String IATA_CODE_MUST_NOT_BE_EMPTY = "airport_02";
    /**
     * Airport not exists
     */
    public static final String AIRPORT_NOT_EXISTS = "airport_03";
    /**
     * Airport not saved
     */
    public static final String AIRPORT_NOT_SAVED = "airport_04";
    /**
     * Iata code already exists
     */
    public static final String IATA_CODE_ALREADY_EXISTS = "airport_05";
    /**
     * Fail to toggle airport active status
     */
    public static final String FAIL_TO_TOGGLE_ACTIVE_STATUS_AIRPORT = "airport_06";
    /**
     * Cabin code is required
     */
    public static final String CABIN_CODE_IS_REQUIRED = "c1001";
    /**
     * Cabin title is required
     */
    public static final String CABIN_TITLE_IS_REQUIRED = "c1002";
    /**
     * Cabin code and title must be unique
     */
    public static final String CABIN_CODE_AND_TITLE_MUST_BE_UNIQUE = "c1003";
    /**
     * Failed to change active status of cabin
     */
    public static final String FAILED_TO_CHANGE_CABIN_ACTIVE_STATUS = "c1004";
    /**
     * Aircraft id is required
     */
    public static final String AIRCRAFT_ID_IS_REQUIRED = "ac2001";
    /**
     * Cabin id is required
     */
    public static final String CABIN_ID_IS_REQUIRED = "c1005";
    /**
     * No of seats is required
     */
    public static final String NO_OF_SEAT_IS_REQUIRED = "ac2002";

    /**
     * City ID is not found
     */
    public static final String ADDRESS_IS_REQUIRED = "man1012";


    public static final String COMMON_FIELD_ERROR = "field01";

    /**
     * Engine Model Types
     */
    public static final String ENGINE_MODEL_TYPE_NAME_MUST_NOT_BE_EMPTY = "emtn01";
    public static final String ENGINE_MODEL_TYPE_NAME_ALREADY_EXISTS = "emtn02";
    public static final String ENGINE_MODEL_TYPE_IS_NOT_SAVED = "emtn03";
    public static final String ENGINE_MODEL_TYPE_IS_NOT_UPDATED = "emtn04";
    public static final String ENGINE_MODEL_TYPE_STATUS_CHANGED_FAILED = "emtn05";

    public static final String LOCATION_NOT_EXISTS = "loc001";

    public static final String WORK_SHOPS_ALREADY_EXISTS = "ws001";

    /**
     * Refresh token was expired. Please make a new signin request.
     */
    public static final String REFRESH_TOKEN_WAS_EXPIRED = "a50001";
    /**
     * Invalid user name or password.
     */
    public static final String INVALID_USER_NAME_OR_PASSWORD = "a50002";
    /**
     * Refresh token is required.
     */
    public static final String REFRESH_TOKEN_IS_REQUIRED = "a40020";
    public static final String CHILD_DATA_EXISTS = "cde1000";
    public static final String PARENT_DATA_EXISTS = "cde1001";

    public static final String UNIT_MEASUREMENT_CODE_EXISTS = "umc10001";
    public static final String UNIT_MEASUREMENT_ID_IS_REQUIRED = "umc10002";
    public static final String UNIT_MEASUREMENT_NOT_FOUND = "umc10003";

    public static final String NUMBER_INVALID = "edcm1002";

    public static final String FAILED_TO_JASPER_TEMPLATE = "jr10001";

    /**
     * Major Component Part No not found
     */
    public static final String MAJOR_COMP_PARTNO_NOT_FOUND = "mc101";

    /**
     * Major Component Description not found
     */
    public static final String MAJOR_COMP_DESCRIPTION_NOT_FOUND = "mc102";
    /**
     * Could not change active status because cabin is already used
     */
    public static final String CABIN_ALREADY_USED = "c1006";
    /**
     * Engine model type does not exists
     */
    public static final String ENGINE_MODEL_TYPE_NOT_EXISTS = "ent1001";
    /**
     * Engine model type id is required
     */
    public static final String ENGINE_MODEL_TYPE_ID_IS_REQUIRED = "emt1002";
    /**
     * airport location name already exists
     */
    public static final String AIRPORT_LOCATION_NAME_ALREADY_EXISTS = "al_100";
    public static final String MODEL_NAME_ALREADY_EXIST = "model1001";

    public static final String POSITION_NOT_SAVED = "pos001";

    public static final String POSITION_NOT_EXISTS = "pos002";
    public static final String ALREADY_APPROVED = "storedemand001";
    public static final String NOT_EDITABLE = "wfa002";
    public static final String HAS_ACTIVE_ITEM = "wfa003";
    public static final String INVALID_OLD_DEMAND = "wfa004";
    public static final String INVALID_REQUEST = "common1001";
    public static final String ISSUE_EXIST_OF_SAME_DEMAND = "storeissue001";
    public static final String PROCUREMENT_EXIST_OF_SAME_DEMAND = "pro001";
    public static final String INVALID_DEMAND_ITEM = "storeissue002";
    public static final String WORK_FLOW_ACTION_ORDER_OUT_OF_RANGE = "wfa102";
    public static final String VOUCHER_NO_ERROR = "vsi100";
    public static final String DATE_RANGE_LIMIT_ERROR = "dat101";
    public static final String TASK_TYPE_NAME_ALREADY_EXIST = "tasktype101";
    public static final String FROM_DATE_MUST_BE_LESS_THAN_OR_EQUAL_TO_DATE = "dat1002";

    public static final String DATE_RANGE_LIMIT_EXCEED = "dat1003";
    public static final String DATE_RANGE_LIMIT_EXCEED_FOR_12_MONTH = "dat1004";
    public static final String INVALID_TO_DATE = "dat1005";
    public static final String NO_THRESHOLD_EXIST = "th101";
    public static final String NO_INTERVAL_EXIST = "it101";
    public static final String NOT_SUPER_ADMIN = "at0001";
    public static final String NOT_VALID_USER = "at0002";
    public static final String PENDING_ON_AUDIT = "cs100";
    public static final String ALREADY_REJECTED = "cs101";
    public static final String DATA_NOT_DELETED = "cs102";
    public static final String WORK_FLOW_ACTION_NOT_ASSIGNABLE = "wfa009";
    public static final String AIRCRAFT_EFFECTIVITY_NOT_FOUND = "af101";

    public static final String TASK_NOT_APPLICABLE = "af102";
    public static final String AIRCRAFT_BUILD_NOT_FOUND = "ab1001";
    public static final String FAILED_TO_INACTIVE_AIRCRAFT_BUILD = "ab1002";
    public static final String OUT_HOUR_CYCLE_MUST_BE_GREATER_THAN_IN_HOUR_CYCLE = "ab2001";
    public static final String AT_LEAST_ONE_ID_REQUIRED = "rfq001";
    public static final String DATA_NOT_FOUND_DYNAMIC = "common07";
    public static final String COUNT_OF_SERIAL_NO_AND_QUANTITY_MUST_SAME = "store100";
    public static final String ISSUED_QUANTITY_MUST_NOT_GREATER_THAN_ITEM_DEMAND_QUANTITY = "store101";
    public static final String AT_LEAST_ONE_ITEM_MUST_BE_ISSUED = "store103";
    public static final String SERIAL_MAX_LENGTH_EXCEED = "sle1001";
    public static final String RETURN_UNSERVICEABLE_IS_EMPTY = "rup1001";
    public static final String RETURN_SERVICEABLE_IS_EMPTY = "up1001";
    public static final String INVALID_INSTALLED_SERIAL_ID = "rup1002";
    public static final String INSTALL_AND_REMOVED_PART_SERIAL_ID_CAN_NOT_BE_SAME = "rup1004";
    public static final String INVALID_REMOVED_SERIAL_ID = "rup1003";
    public static final String SCRAP_PART_DOES_NOT_EXIST_UNDER_THE_SCRAP = "scrap100";
    public static final String VOUCHER_ERROR = "voucher0001";
    public static final String PART_INVOICES_NOT_FOUND = "PartInv401";
    public static final String INVALID_STORE_PART_SERIAL = "storepartserial001";
    public static final String SERIAL_ID_AND_NO_MISSING = "storepartserial002";
    public static final String INSPECTION_CLOSED = "inspection0001";
    public static final String RETURN_AND_INWARD_ID_MISSING = "inspection0002";
    public static final String RETURN_SERIAL_NOT_ISSUED = "rd101";
    public static final String CITY_ALREADY_EXITS = "city001";
    public static final String QUOTE_REQUEST_VENDOR_DOES_NOT_EXIST_UNDER_THE_QUOTE_REQUEST = "rfqv100";
    public static final String DONE_HOUR_EXCEED_THAN_TOTAL_AIRCRAFT_HOUR = "dh102";
    public static final String DONE_CYCLE_EXCEED_THAN_TOTAL_AIRCRAFT_CYCLE = "dc101";
    public static final String NO_MLG_FOUND = "mlg1001";
    public static final String WRONG_SERIAL = "returnserial001";
    public static final String STOCK_NOT_AVAILABLE = "storeissueavail001";
    public static final String SERIAL_ISSUED_OR_SCRAPPED = "storepartserial003";
    public static final String DESIGNATION_NAME_UNDER_THIS_SECTION_ALREADY_EXIST = "designation001";
    public static final String EMPLOYEE_UNDER_THIS_DESIGNATION_ALREADY_EXISTS = "employee001";
    public static final String UNSERVICEABLE_PART_SHOULD_NOT_BE_ISSUED = "uni100";
    public static final String QUANTITY_MUST_NOT_BE_NULL_FOR_CONSUMABLE_PART = "sps100";
    public static final String PART_MUST_BE_MATCHED_FOR_SERIAL_AND_AVAILABILITY = "sps102";
    public static final String INPUT_TYPE_IS_REQUIRED = "po102";
    public static final String INPUT_TYPE_MUST_NOT_BE_UPDATE = "po103";
    public static final String PART_MUST_NOT_BE_UPDATE_FOR_CS = "po104";
    public static final String INVALID_AIRCRAFT_AVERAGE_HOUR_CYCLE = "aravg101";

    public static final String INVALID_AIRCRAFT_AVERAGE_APU_HOUR_CYCLE = "aravg102";
    public static final String PART_IS_ALREADY_EXISTS_FOR_THIS_AC_TYPE = "part101";
    /**
     * Unique Position id is required
     */
    public static String POSITION_ID_ALREADY_EXISTS = "pos003";

    public static final String POSITION_ID_IS_REQUIRED = "pos004";

    public static final String POSITION_NAME_IS_REQUIRED = "pos005";

    public static final String MODEL_TREE_EXISTS_WITH_SIMILAR_CONFIGURATION = "a40021";
    public static final String FAILED_TO_SAVE_MODEL_TREE = "a40022";
    /**
     * Page no is required
     */
    public static final String PAGE_NO_IS_REQUIRED = "aml1001";
    /**
     * Date is required
     */
    public static final String DATE_IS_REQUIRED = "aml1002";
    /**
     * Page no already exits
     */
    public static final String PAGE_NO_ALREADY_EXITS = "aml1003";
    public static final String MODEL_CAN_NOT_BE_HIGHER_MODEL_ITSELF = "a40023";

    public static final String POSITION_NAME_CAN_NOT_BE_NULL = "a40032";
    /**
     * Part no. and model id already exits
     */
    public static final String PART_NO_AND_MODEL_ID_ALREADY_EXISTS = "part_101";
    public static final String PART_ID_IS_REQUIRED = "part_102";
    public static final String PART_NOT_FOUND = "part_103";
    /**
     * AML connection not saved
     */
    public static final String AML_CONNECTION_NOT_SAVED = "amlc1001";
    /**
     * Signature auth name already exists
     */
    public static final String SIGNATURE_AUTH_NAME_ALREADY_EXISTS = "signature_100";

    /**
     * Aircraft maintenance log is already used
     */
    public static final String AML_IS_ALREADY_USED = "aml1004";
    /**
     * Unique Position name is required
     */
    public static final String UNIQUE_NAME_IS_REQUIRED = "pos006";

    public static final String DATA_NOT_FOUND_BY_THIS_AIRCRAFT_ID = "common03";
    /**
     * Failed to delete aml signatures
     */
    public static final String FAILED_TO_DELETE_AML_SIGNATURES = "amlcs1001";
    public static final String REVERSE_MODEL_TREE_EXISTS = "a50000";

    /**
     * Start time must be before end time
     */
    public static final String START_TIME_MUST_BE_BEFORE_END_TIME = "fl_100";
    /**
     * Store stock inward inactive is not possible due to child dependency.
     * Oil Record type does not Exist
     */
    public static final String UNABLE_TO_RETRIEVE_ERP_DATA = "erp_100";

    public static final String ACTION_FLOW_ORDER_NUMBER_IS_NULL = "afon1000";
    public static final String WORK_FLOW_DATA_EXIST = "afde10001";
    public static final String WORK_FLOW_ACTION_ALREADY_EXIST = "wfa100";
    public static final String WORK_FLOW_ACTION_ORDER_ALREADY_ACTIVE = "wfa101";

    /**
     * Store stock inward serial no. already exist
     */
    public static final String SERIAL_NO_ALREADY_EXIST = "ssi100";
    public static final String STORE_STOCK_INWARD_DELETE_IS_NOT_POSSIBLE = "ssi101";
    public static final String STORE_ISSUE_VOUCHER_NO_ALREADY_EXIST = "si100";
    public static final String STORE_STOCK_ROOM_CODE_EXIST = "ssr1000";
    public static final String OIL_RECORD_TYPE_NAME_IS_NOT_EXIT = "oilr404";
    /**
     * Oil Record AML id  doesn't match
     */
    public static final String AML_ID_MISS_MATCH = "oilr405";
    /**
     * This type of record is already exist
     */
    public static final String RECORD_EXIST = "oilr406";
    /**
     * Oil Record Status Can not Update
     */
    public static final String OIL_RECORD_ACTIVE_STATUS_CANT_BE_UPDATED = "oilr407";
    /**
     * No AML Oil Record Found by The ID Provided
     */
    public static final String NO_AML_OIL_RECORD_ID_FOUND = "oilr408";
    public static final String SHOULD_NOT_HAVE_TSO = "a40024";
    public static final String SHOULD_NOT_HAVE_TSLSV = "a40025";
    public static final String PART_AND_HIGHER_PART_HIERARCHY_SHOULD_BE_DIFFERENT = "a40027";
    public static final String INVALID_PART_HIERARCHY_TYPE = "a40028";
    public static final String ENTITY_EXISTS_WITH_SAME_CONFIGURATION = "cm40000";

    public static final String  ENTITY_EXISTS_WITH_SAME_PART_AND_POSITION ="cm40001";
    /**
     * Task No. already exists
     */
    public static final String TASK_NO_ALREADY_EXISTS = "task001";
    public static final String INVALID_ALTERNATE_PARE = "a40029";
    public static final String ALTER_PART_NOT_FOUND = "a40030";

    /**
     * AML Book aircraft id & start page already exists
     */
    public static final String AML_BOOK_AIRCRAFT_ID_AND_START_PAGE_ALREADY_EXISTS = "aml_book_01";
    /**
     * AML Book start page is not valid
     */
    public static final String START_PAGE_IS_NOT_VALID = "aml_book_02";
    /**
     * AML Book end page is not valid
     */
    public static final String END_PAGE_IS_NOT_VALID = "aml_book_03";
    /**
     * amlId already exists
     */
    public static final String AML_ID_ALREADY_EXISTS = "fl_101";
    /**
     * Aircraft not found
     */
    public static final String AIRCRAFT_NOT_FOUND = "fl_102";

    public static final String AML_RECORD_TYPE_CAN_NOT_BE_SAME = "oilr409";

    /**
     * Task effectivity is not valid
     */
    public static final String TASK_EFFECTIVITY_IS_NOT_VALID = "task_0071";
    public static final String STORE_ISSUE_SERIAL_NO_ALREADY_EXIST = "si100";
    public static final String RFQ_NO_ALREADY_EXIST = "rq100";
    public static final String REQUISITION_NO_ALREADY_EXIST = "re100";
    public static final String AML_LOG_NOT_EXISTS = "aml1005";
    public static final String REQUEST_DATA_IS_EMPTY = "req1001";
    public static final String UNABLE_TO_PARSE_TIME_UNIT = "atu1001";


    /**
     * File extension is not valid
     */
    public static final String FILE_EXTENSION_IS_NOT_VALID = "AL_00001";
    /**
     * File rows not found
     */
    public static final String FILE_ROWS_NOT_FOUND = "AL_00002";
    /**
     * File import error
     */
    public static final String FILE_IMPORT_ERROR = "AL_00003";
    /**
     * Excel file content type error
     */
    public static final String INVALID_FILE_FORMAT = "AL_00004";
    /**
     * Invalid aircraft check done data
     */
    public static final String INVALID_CHECK_DONE = "AC_00001";
    /**
     * File error
     */
    public static final String FILE_ERROR = "AL_00005";
    /**
     * Workbook unable to close
     */
    public static final String WORKBOOK_UNABLE_TO_CLOSE = "AL_00006";
    /**
     * Page number is not found in any book
     */
    public static final String PAGE_NUMBER_IS_NOT_FOUND_IN_ANY_BOOK = "aml1006";
    /**
     * Invalid page number.
     */
    public static final String INVALID_PAGE_NO = "aml1007";
    public static final String VOUCHER_NO_ALREADY_EXISTS = "vc001";
    public static final String RELEAESE_NO_ALREADY_EXISTS = "re001";
    public static final String REQUEST_TYPE_IS_NOT_VALID = "req001";


    public static final String AML_ID_ARE_SAME_FOR_THIS_INTERMEDIATE_AND_CORRECTIVE = "mel001";

    public static final String INVALID_DEFERMENT_CODE = "def1001";

    public static final String INVALID_MEL_STATUS_CODE = "mel1001";

    public static final String INVALID_MEL_CATEGORY_CODE = "mel1002";

    public static final String HEADER_CELL_IS_MISSING = "excel5001";
    public static final String FILE_CAN_NOT_BE_NULL = "excel5003";
    public static final String FILE_NAME_CAN_NOT_BE_NULL = "excel5004";
    public static final String FILE_HEADER_CAN_NOT_BE_NULL = "excel5005";
    public static final String INVALID_HEADER_SIZE = "excel5006";
    public static final String META_DATA_NOT_FOUND = "excel5007";
    public static final String HEARER_SIZE_IS_REQUIRED = "excel5008";
    public static final String COLUMN_DEFINITION_LIST_IS_REQUIRED = "excel5009";
    public static final String HEADER_SIZE_AND_COLUMN_DEFINITION_LIST_SIZE_IS_DIFFERENT = "excel5010";
    public static final String COLUMN_NUMBER_IS_REQUIRED = "excel5011";
    public static final String NAME_CAN_NOT_BE_BLANK = "excel5012";
    public static final String INVALID_COLUMN_NUMBER = "excel5013";
    public static final String DUPLICATE_COLUMN_NUMBER = "excel5014";
    public static final String DUPLICATE_COLUMN_NAME = "excel5015";
    public static final String COLUMN_NOT_RECOGNIZED = "excel5016";
    /**
     * No A Check Phase Data found for this Aircraft
     */
    public static final String A_CHK_PHASE_DATA_FOUND_BY_THIS_AIRCRAFT_ID = "aphs001";

    /**
     * Page no must be alpha numeric if allow alphabet is true
     */
    public static final String PAGE_NUMBER_MUST_BE_ALPHA_NUMERIC_IF_ALLOW_ALPHABET_IS_TRUE = "aml1008";
    public static final String NO_A_PHASE_CHECK_DATA_NOT_FOUND_BY_THIS_AIRCRAFT_ID = "aphs001";

    /**
     * Exception happened while saving remark
     */
    public static final String EXCEPTION_HAPPENED_WHILE_SAVING_REMARK = "r2000";
    /**
     * Invalid remark id
     */
    public static final String INVALID_REMARK_ID = "r2001";
    /**
     * if repetitive type is repetitive, there must be a interval of interval type
     */
    public static final String INVALID_TASK_INTERVAL = "ti1001";
    /**
     * Same aircraft found on multiple remarks
     */
    public static final String SAME_AIRCRAFT_FOUND_ON_MULTIPLE_REMARK = "r2002";
    /**
     * Exception happened while deleting remark
     */
    public static final String EXCEPTION_HAPPENED_WHILE_DELETING_REMARK = "r2003";
    /**
     * Flight data can't be null or empty
     */
    public static final String INVALID_FLIGHT_DATA = "fd1001";
    /**
     * Block on time is required in flight data
     */
    public static final String BLOCK_ON_TIME_IS_REQUIRED = "fd1002";
    /**
     * Block off time is required in flight data
     */
    public static final String BLOCK_OFF_TIME_IS_REQUIRED = "fd1003";
    /**
     * Take off time is required in flight data
     */
    public static final String TAKE_OFF_TIME_IS_REQUIRED = "fd1004";
    /**
     * Landing time is required in flight data
     */
    public static final String LANDING_TIME_IS_REQUIRED = "fd1005";
    /**
     * No of landing is required in flight data
     */
    public static final String NO_OF_LANDING_IS_REQUIRED = "fd1006";
    /**
     * Sequence is required for defect and rectification
     */
    public static final String INVALID_DEFECT_AND_RECTIFICATION = "dr1001";
    public static final String EXCEL_FILE_IS_REQUIRED = "excel5017";
    public static final String FAILED_TO_CONVERT_FROM_STRING_TO_LOCAL_DATE = "d6001";
    public static final String HIGHER_PART_NOT_FOUND = "hp6001";
    public static final String COLUMN_PAIR_SHOULD_HAVE_DIFFERENT_COLUMN = "excel5018";
    public static final String CLASS_CAST_EXCEPTION = "cce40001";
    public static final String FAILED_TO_PARSE_DATA_TYPE_ENUM = "a60001";
    public static final String BUILD_IS_NOT_VALID_ACCORDING_TO_MODEL_TREE = "a60002";
    public static final String LIST_CAN_NOT_BE_OF_TYPE_LIST = "excel5019";
    public static final String PATTERN_IS_APPLICABLE_ONLY_FOR_STRING = "excel5020";
    public static final String OPERATOR_TYPE_CAN_NOT_BE_NULL = "excel5021";
    public static final String INVALID_COLUMN_FOR_OPERATIONS = "excel5022";
    public static final String FAILED_TO_PARSE_OPERATOR_TYPE_ENUM = "a60003";
    public static final String OPERATION_CAN_NOT_BE_PERFORMED_ON_LIST_DATA = "excel5023";
    public static final String VALUE_CAN_NOT_BE_COMPARED_WITH_DIFFERENT_TYPE = "excel5024";
    public static final String NOT_EQUAL_COMPARISON_IS_ALLOWED_FOR_BOOLEAN_AND_STRING = "excel5025";
    public static final String INVALID_METADATA_IS_VALID_DATE = "excel5026";
    public static final String INVALID_COLUMNS_CONSTRAINTS = "excel5027";
    public static final String INVALID_COLUMNS_CONSTRAINT_VALUE = "excel5028";
    public static final String DATA_TYPE_MISS_MATCHED_WITH_COLUMN_DATA_TYPE = "excel5029";
    public static final String FIRST_AND_SECOND_COLUMN_CAN_NOT_BE_NULL = "excel5030";
    /**
     * Invalid aircraft selected
     */
    public static final String INVALID_AIRCRAFT = "aml4001";
    /**
     * Page no alphabet must be A to Z
     */
    public static final String INVALID_ALPHABET = "aml4002";
    /**
     * First aml page no should not be alpha numeric
     */
    public static final String INVALID_ALPHA_NUMERIC_PAGE_NO = "aml4003";
    /**
     * Alpha numeric page no should be last aml page no
     */
    public static final String ALPHA_NUMERIC_PAGE_NO_MUST_BE_LAST_AML_PAGE_NO = "aml4004";
    /**
     * Consumable Part not found
     */
    public static final String CONSUMABLE_PART_NOT_FOUND = "cpnf229";


    public static final String AIRCRAFT_MODEL_NOT_FOUND_WITH_ID = "ame-123456";
    /**
     * Block off time must be before block on time
     */
    public static final String BLOCK_OFF_TIME_MUST_BE_BEFORE_BLOCK_ON_TIME = "fd2001";
    /**
     * Take off time must be before landing time
     */
    public static final String TAKE_OFF_MUST_BE_BEFORE_LANDING_TIME_TIME = "fb2002";
    /**
     * Block off time must be before take off time
     */
    public static final String BLOCK_OFF_TIME_MUST_BE_BEFORE_TAKE_OFF_TIME = "fb2003";
    /**
     * Landing time must be before block on time
     */
    public static final String LANDING_TIME_MUST_BE_BEFORE_BLOCK_ON_TIME = "fb2004";
    /**
     * Block on time and block off time both need to be present
     */
    public static final String BLOCK_ON_TIME_AND_BLOCK_OFF_TIME_BOTH_NEED_TO_BE_PRESENT = "fb2005";
    /**
     * Landing time and take off time both need to be present
     */
    public static final String LANDING_TIME_AND_TAKE_OFF_TIME_BOTH_NEED_TO_BE_PRESENT = "fb2006";
    /**
     * Oil record can't be null or empty
     */
    public static final String OIL_RECORD_CANT_BE_NULL_OR_EMPTY = "or2001";
    /**
     * Please provide block off time, block on time, take off time, landing time and no of landing
     */
    public static final String INVALID_FLIGHT_DATA_DTO = "fd2007";
    /**
     * Invalid block off time
     */
    public static final String INVALID_BLOCK_OFF_DATE = "fd2008";
    /**
     * Invalid block on time
     */
    public static final String INVALID_BLOCK_ON_DATE = "fd2009";
    /**
     * Valid vendor quotation detail id required.
     */
    public static final String VALID_VENDOR_DETAIL_ID_REQUIRED = "vq100";
    /**
     * Valid vendor quotation fee id required.
     */
    public static final String VALID_VENDOR_FEE_ID_REQUIRED = "vq101";
    /**
     * Vendor demand detail already exist under same part number.
     */
    public static final String VENDOR_QUOTATION_DETAIL_ALREADY_EXIST_UNDER_SAME_PART = "vq102";

    public static final String DUPLICATE_VENDOR_EXIST = "vend200";

    public static final String DESCRIPTION_NOT_FOUND = "ic001";

    public static final String REJECTED_DESCRIPTION_CAN_NOT_BE_EMPTY = "rd001";

    public static final String STORE_SERIAL_PART_DOES_NOT_MATCH = "stp500";

    public static final String STORE_PART_SERIAL_IS_NOT_FOUND = "stp501";

    public static final String STORE_PART_AVAILABILITY_IS_NOT_FOUND = "spa001";

    public static final String STORE_PART_AVAILABILITY_QUANTITY_IS_ZERO = "spa002";

    public static final String SERIAL_NOS_SHOULD_BE_NOT_EMPTY = "si150";


    public static final String UNABLE_TO_PARSE = "pe101";
    /**
     * Invalid wo no
     */
    public static final String INVALID_WO_NO = "wo_100";
    /**
     * Cabin code already exists
     */
    public static final String CABIN_CODE_ALREADY_EXISTS = "cabin_111";
    /**
     * Cabin title already exists
     */
    public static final String CABIN_TITLE_ALREADY_EXISTS = "cabin_222";
    /**
     * Cabin Code and Title same as previous Code and Title
     */
    public static final String CABIN_CODE_AND_TITLE_NOT_CHANGE = "cabin_333";
    /**
     * AC Check Already Exist For AC Model
     */
    public static final String AC_CHECK_ALREADY_EXIST = "acae229";
    /**
     * Check Title Already Exist
     */
    public static final String CHECK_TITLE_ALREADY_EXIST = "ctae229";
    /**
     * Task Not Found
     */
    public static final String TASK_NOT_FOUND = "tnf229";

    public static final String CAN_NOT_UPDATE_INACTIVE_ENTITY = "common_error_40001";
    /**
     * Invalid aml type code
     */
    public static final String INVALID_AML_TYPE_CODE = "aml7001";
    /**
     * Invalid total airframe time
     */
    public static final String INVALID_TOTAL_AIRFRAME_TIME = "airtime_101";
    /**
     * Invalid total bd airframe time
     */
    public static final String INVALID_TOTAL_BD_AIRFRAME_TIME = "airtime_102";
    /**
     * Aircraft name already exits
     */
    public static final String AIRCRAFT_NAME_ALREADY_EXISTS = "air_123456";
    /**
     * Airframe serial already exists
     */
    public static final String AIRFRAME_SERIAL_ALREADY_EXISTS = "air_654321";
    /**
     * Aircraft and cabin already exists
     */
    public static final String AIRCRAFT_AND_CABIN_ALREADY_EXISTS = "air_cab_001";
    /**
     * Bangladesh total time must be smaller or equal to aircraft total time
     */
    public static final String BANGLADESH_TOTAL_TIME_MUST_BE_SMALLER_OR_EQUAL_TO_AIRCRAFT_TOTAL_TIME = "te_101";
    /**
     * Bangladesh total cycle must be smaller or equal to aircraft total cycle
     */
    public static final String BANGLADESH_TOTAL_CYCLE_MUST_BE_SMALLER_OR_EQUAL_TO_AIRCRAFT_TOTAL_CYCLE = "ce_101";
    public static final String SHEET_IS_EMPTY_OR_NOT_FOUND = "excel5031";
    /**
     * total air time is required
     */
    public static final String TOTAL_AIR_TIME_REQUIRED = "fd7000";
    /**
     * total landing is required
     */
    public static final String TOTAL_LANDING_REQUIRED = "fd7001";
    /**
     * Ac Check list are not valid
     */
    public static final String AC_CHECK_LIST_ARE_NOT_VALID = "aclrnv229";
    /**
     * Ac Type Check Not Found
     */
    public static final String AC_TYPE_CHECK_NOT_FOUND = "atcnf229";
    /**
     * Ldnd Not Found
     */
    public static final String  LDND_NOT_FOUND="lnf229";

    public static final String APU_NOT_AVAILABLE_FOR_THIS_AIRCRAFT="lnf230";
    /**
     * Aircraft Type Check Ids must not be null
     */
    public static final String AC_TYPE_CHECK_IDS_MUST_NOT_BE_NULL = "atcimnbn229";
    /**
     * Ldnd Ids must not be null
     */
    public static final String LDNDIDS_MUST_NOT_BE_NULL = "limnbn229";
    /**
     * Life limit unit enum error
     */
    public static final String LIFE_LIMIT_UNIT_ENUM_ERROR = "lluer-1";
    /**
     * part no is already exits
     */
    public static final String PART_IS_ALREADY_EXISTS = "p2001";
    public static final String PART_AVAILABILITY_IS_ALREADY_EXISTS = "pv2001";

    public static final String PART_REMARK_DATA_NOT_SAVED = "pr001";
    /**
     * Invalid total A/C Hrs
     */
    public static final String INVALID_TOTAL_AC_HRS = "ac_hour_101";

    public static final String INVALID_DONE_HOUR_TIME = "dh101";

    public static final String INVALID_INITIAL_HOUR_TIME = "ih101";

    public static final String AIRCRAFT_AVERAGE_VALUE_NOT_EXIST = "avg101";
    public static final String AIRCRAFT_AVERAGE_APU_VALUE_NOT_EXIST = "avg102";

    public static final String LDND_UPDATE_BY_ATL_IS_FAILED = "ldnd101";

    public static final String APU_HOURS_MUST_BE_GREATER_THAN_AIRCRAFT_APU_HOUR ="ldnd103";

    public static final String APU_CYCLE_MUST_BE_GREATER_THAN_AIRCRAFT_APU_CYCLE ="ldnd104";

    public static final String AIRCRAFT_BUILD_NOT_FOUND_BY_PART_SERIAL = "ab1003";

    public static final String LDND_NOT_FOUND_BY_PART_SERIAL = "ldnd102";
    /**
     * Engine shop visit not found
     */
    public static final String ENGINE_SHOP_VISIT_NOT_FOUND = "esv1001";
    /**
     * Failed to save engine shop visits information
     */
    public static final String FAILED_TO_SAVE_ENGINE_SHOP_VISITS = "esv1002";
    /**
     * Engine times not found
     */
    public static final String ENGINE_TIMES_NOT_FOUND = "et1001";
    /**
     * Failed to save engine engine times information
     */
    public static final String FAILED_TO_SAVE_ENGINE_TIME = "et1002";
    /**
     * Invalid shop visited information
     */
    public static final String INVALID_SHOP_VISITED_INFO = "esv1003";
    /**
     * Invalid model type. Engine model type should be TMM or RGB
     */
    public static final String INVALID_MODEL_TYPE = "esv1004";
    /**
     * In engine there should be only one tmm and rgb engine model type
     */
    public static final String WRONG_MODEL_TYPE = "emt1001";
    /**
     * Invalid engine time information
     */
    public static final String INVALID_ENGINE_TIME_INFO = "et1003";
    /**
     * Duplicate engine shop info found for specific engine
     */
    public static final String DUPLICATE_SHOP_INFO_FOUND = "esv1005";
    /**
     * Duplicate engine time info found for specific engine
     */
    public static final String DUPLICATE_ENGINE_TIME_INFO_FOUND = "et1004";

    public static final String ESTIMATED_DUE_CALCULATION_FAILED = "est101";
    /**
     * Invalid mel type
     */
    public static final String INVALID_MEL_TYPE = "mel1003";
    /**
     * nrc no is already used
     */
    public static final String DUPLICATE_NRC_NO = "nrc1001";

    public static final String INVALID_TASK_STATUS_TYPE = "task1001";

    public static final String INVALID_TASK_REPETITIVE_TYPE = "task1002";

    public static final String INVALID_EFFECTIVITY_TYPE = "task1002";
    /**
     * Page no alphabet must greater than previous page no alphabet
     */
    public static final String INVALID_AML_ALPHABET = "aml4010";
    /**
     * Duplicate aircraft build exists for same aircraft, model, higher model, location and position
     */
    public static final String INVALID_AIRCRAFT_BUILD = "ab1004";
    /**
     * Invalid ATL date. ATL date must be equal or greater than previous ATL date
     */
    public static final String INVALID_AML_DATE = "aml4011";
    /**
     * Invalid ATL date. ATL date must be equal or greater than previous ATL date and equal or less than next ATL date
     */
    public static final String INVALID_ATL_DATE = "aml4012";

    public static final String INVALID_LDND_ID = "a60005";
    public static final String FORECAST_AIRCRAFT_NOT_FOUND = "a60006";
    public static final String FORECAST_TASK_NOT_FOUND = "a60007";
    public static final String FORECAST_PART_NOT_FOUND = "a60008";
    public static final String PART_OR_CONSUMABLE_PART_IS_REQUIRED = "a60009";
    public static final String FORECAST_ID_IS_REQUIRED = "a60010";
    public static final String TASK_EXCEED_FOR_SINGLE_AIRCRAFT = "a60011";
    public static final String NUMBER_OF_TOTAL_FORECAST_TASKS_EXCEED = "a60012";
    /**
     * This folder contains files. Please, remove all the files in this folder before trying to delete this folder
     */
    public static final String FOLDER_IS_NOT_EMPTY = "fold001";
    /**
     * Invalid folder type
     */
    public static final String INVALID_FOLDER_TYPE = "fold002";
    /**
     * Folder type is required to create a new folder
     */
    public static final String FOLDER_TYPE_REQUIRED = "fold003";
    /**
     * Folder name already exists
     */
    public static final String FOLDER_NAME_EXISTS = "fold004";
    /**
     * Folder does not exist
     */
    public static final String FOLDER_DOES_NOT_EXISTS = "fold005";
    /**
     * Folder is not included
     */
    public static final String FOLDER_NOT_INCLUDED = "fold006";
    /**
     * Folder name length must be between 1 and 128 characters
     */
    public static final String INVALID_FOLDER_NAME_LENGTH = "fold007";
    /**
     * File name exists
     */
    public static final String PLANNING_FILE_NAME_EXISTS = "file001";
    /**
     * File does not exist
     */
    public static final String PLANNING_FILE_DOES_NOT_EXISTS = "file002";
    /**
     * File name length must be between 1 and 128 characters
     */
    public static final String INVALID_PLANNING_FILE_NAME_LENGTH = "file003";
    /**
     * File URL cannot be empty
     */
    public static final String INVALID_PLANNING_FILE_URL = "file004";
    /**
     * File key cannot be empty
     */
    public static final String INVALID_PLANNING_FILE_KEY = "file005";

    public static final String DUPLICATE_MATCH_STRING = "file006";

    public static final String MATCH_STRING_ALREADY_EXISTS = "file007";
    /**
     * Invalid aircraft model.
     */
    public static final String INVALID_AIRCRAFT_MODEL = "am1001";

    public static final String INVALID_DUE_DATE_COLOR = "due1001";

    public static final String INVALID_A_CHECK_DONE_HOUR = "acd101";

    public static final String DEMAND_ITEM_LIST_NOT_FOUND = "issue404";
    public static final String SERIAL_ALREADY_USED = "sps101";
    /**
     * Defect and rectification can not be deleted because it is already used in MEL.
     */
    public static final String CAN_NOT_DELETE_DEFECT_AND_RECTIFICATION = "dar1001";
    /**
     * Exception happened while deleting defect and rectification
     */
    public static final String EXCEPTION_HAPPENED_WHILE_DELETING_DEFECT_AND_RECTIFICATION = "dar1002";

    public static final String AIRCRAFT_IN_HOUR_IS_NOT_VALID = "ab1005";

    public static final String AIRCRAFT_IN_CYCLE_IS_NOT_VALID = "ab1006";
    public static final String LOCATION_TAG_IS_REQUIRED = "ab1007";
}

