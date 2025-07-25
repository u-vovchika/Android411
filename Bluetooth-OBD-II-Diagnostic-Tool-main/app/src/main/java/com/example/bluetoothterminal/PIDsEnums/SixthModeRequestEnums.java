package com.example.bluetoothterminal.PIDsEnums;

import java.util.HashMap;
import java.util.Map;

public enum SixthModeRequestEnums {
    TIDs_SUPPORTED_01_20("00"),
    EXHAUST_GAS_SENSOR_BANK_1__SENSOR_1("01"),
    EXHAUST_GAS_SENSOR_BANK_1__SENSOR_2("02"),
    EXHAUST_GAS_SENSOR_BANK_1__SENSOR_3("03"),
    EXHAUST_GAS_SENSOR_BANK_1__SENSOR_4("04"),
    EXHAUST_GAS_SENSOR_BANK_2__SENSOR_1("05"),
    EXHAUST_GAS_SENSOR_BANK_2__SENSOR_2("06"),
    EXHAUST_GAS_SENSOR_BANK_2__SENSOR_3("07"),
    EXHAUST_GAS_SENSOR_BANK_2__SENSOR_4("08"),
    EXHAUST_GAS_SENSOR_BANK_3__SENSOR_1("09"),
    EXHAUST_GAS_SENSOR_BANK_3__SENSOR_2("0A"),
    EXHAUST_GAS_SENSOR_BANK_3__SENSOR_3("0B"),
    EXHAUST_GAS_SENSOR_BANK_3__SENSOR_4("0C"),
    EXHAUST_GAS_SENSOR_BANK_4__SENSOR_1("0D"),
    EXHAUST_GAS_SENSOR_BANK_4__SENSOR_2("0E"),
    EXHAUST_GAS_SENSOR_BANK_4__SENSOR_3("0F"),
    EXHAUST_GAS_SENSOR_BANK_4__SENSOR_4("10"),
    TIDs_SUPPORTED_21_40("20"),
    CATALYTIC_BANK_1("21"),
    CATALYTIC_BANK_2("22"),
    CATALYTIC_BANK_3("23"),
    CATALYTIC_BANK_4("24"),
    EGR_BANK_1("31"),
    EGR_BANK_2("32"),
    EGR_BANK_3("33"),
    EGR_BANK_4("34"),
    VVT_BANK_1("35"),
    VVT_BANK_2("36"),
    VVT_BANK_3("37"),
    VVT_BANK_4("38"),
    EVAP_CAP_OFF__0_150("39"),
    EVAP_0_090("3A"),
    EVAP_0_040("3B"),
    EVAP_0_020("3C"),
    FLUX_DE_PURGE("3D"),
    TIDs_SUPPORTED_41_60("40"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_1__SENSOR_1("41"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_1__SENSOR_2("42"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_1__SENSOR_3("43"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_1__SENSOR_4("44"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_2__SENSOR_1("45"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_2__SENSOR_2("46"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_2__SENSOR_3("47"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_2__SENSOR_4("48"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_3__SENSOR_1("49"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_3__SENSOR_2("4A"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_3__SENSOR_3("4B"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_3__SENSOR_4("4C"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_4__SENSOR_1("4D"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_4__SENSOR_2("4E"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_4__SENSOR_3("4F"),
    HEATED_EXHAUST_GAS_SENSOR_BANK_4__SENSOR_4("50"),
    TIDs_SUPPORTED_61_80("60"),
    HEATED_CATALYST_BANK_1("61"),
    HEATED_CATALYST_BANK_2("62"),
    HEATED_CATALYST_BANK_3("63"),
    HEATED_CATALYST_BANK_4("64"),
    SECONDARY_AIR_1("71"),
    SECONDARY_AIR_2("72"),
    SECONDARY_AIR_3("73"),
    SECONDARY_AIR_4("74"),
    TIDs_SUPPORTED_81_A0("80"),
    FUEL_SYSTEM_BANK_1("81"),
    FUEL_SYSTEM_BANK_2("82"),
    FUEL_SYSTEM_BANK_3("83"),
    FUEL_SYSTEM_BANK_4("84"),
    TURBO_PRESSURE_BANK_1("85"),
    TURBO_PRESSURE_BANK_2("86"),
    NOX_ABSORBER_BANK_1("90"),
    NOX_ABSORBER_BANK_2("91"),
    CATALYTIC_NOX_BANK_1("98"),
    CATALYTIC_NOX_BANK_2("99"),
    TIDs_SUPPORTED_A1_C0("A0"),
    GENERAL_MISFIRE_MONITORING_DATA("A1"),
    MISFIRE_DATA_CYLINDER_1("A2"),
    MISFIRE_DATA_CYLINDER_2("A3"),
    MISFIRE_DATA_CYLINDER_3("A4"),
    MISFIRE_DATA_CYLINDER_4("A5"),
    MISFIRE_DATA_CYLINDER_5("A6"),
    MISFIRE_DATA_CYLINDER_6("A7"),
    MISFIRE_DATA_CYLINDER_7("A8"),
    MISFIRE_DATA_CYLINDER_8("A9"),
    MISFIRE_DATA_CYLINDER_9("AA"),
    MISFIRE_DATA_CYLINDER_10("AB"),
    MISFIRE_DATA_CYLINDER_11("AC"),
    MISFIRE_DATA_CYLINDER_12("AD"),
    MISFIRE_DATA_CYLINDER_13("AE"),
    MISFIRE_DATA_CYLINDER_14("AF"),
    MISFIRE_DATA_CYLINDER_15("B0"),
    MISFIRE_DATA_CYLINDER_16("B1"),
    PM_FILTER_BANK_1("B2"),
    PM_FILTER_BANK_2("B3"),
    TIDs_SUPPORTED_C1_E0("C0"),
    TIDs_SUPPORTED_E1_FF("E0");

    private static final Map methodMap = new HashMap();

    static {
        for (SixthModeRequestEnums enums : SixthModeRequestEnums.values())
            methodMap.put(enums.getValue(), enums);
    }

    private final String value;

    SixthModeRequestEnums(String value) {this.value = value;}

    public final String getValue() {
        return value;
    }

    public static String getEnum( String value){
        return String.valueOf(methodMap.get(value));
    }

}
