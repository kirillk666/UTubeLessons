package RandomTasks.strategies.marketModelsByAutofill;

import java.util.HashMap;
import java.util.Map;


public class FootballStrategies {

    public static class AbsentStrategy implements MarketModelsStrategy {
        @Override
        public Map<String, Integer> getMarketModelsMap() {
            Map<String, Integer> modelValuesMap = new HashMap<>();

            modelValuesMap.put("MTCH_TTLGOE", 1);
            modelValuesMap.put("MTCH_HB", 1);
            modelValuesMap.put("MTCH_TTLG", 1);
            modelValuesMap.put("MTCH_R", 1);
            modelValuesMap.put("MTCH_R1", 1);
            modelValuesMap.put("MTCH_DC1", 1);
            modelValuesMap.put("MTCH_DC", 1);

            return modelValuesMap;
        }
    }

    public static class LowStrategy implements MarketModelsStrategy {
        @Override
        public Map<String, Integer> getMarketModelsMap() {
            Map<String, Integer> modelValuesMap = new HashMap<>();

            modelValuesMap.put("MTCH_HB1", 3);
            modelValuesMap.put("MTCH_TTLG", 9);
            modelValuesMap.put("MTCH_T2G", 1);
            modelValuesMap.put("MTCH_HB", 7);
            modelValuesMap.put("MTCH_T2G2", 1);
            modelValuesMap.put("MTCH_TXG12", 1);
            modelValuesMap.put("MTCH_T2TTLGOE", 1);
            modelValuesMap.put("MTCH_TTLG1", 4);
            modelValuesMap.put("MTCH_HB_ASN2", 2);
            modelValuesMap.put("MTCH_DC", 1);
            modelValuesMap.put("MTCH_HB_ASN1", 2);
            modelValuesMap.put("MTCH_TTLGOE1", 1);
            modelValuesMap.put("MTCH_HB_ASN", 5);
            modelValuesMap.put("MTCH_T12G2", 1);
            modelValuesMap.put("MTCH_TTLG2", 4);
            modelValuesMap.put("MTCH_R1", 1);
            modelValuesMap.put("MTCH_TTLGOE2", 1);
            modelValuesMap.put("MTCH_T2G1", 1);
            modelValuesMap.put("MTCH_LTS", 1);
            modelValuesMap.put("MTCH_T1G", 1);
            modelValuesMap.put("MTCH_T12GNM", 1);
            modelValuesMap.put("MTCH_TTLG_ASN1", 2);
            modelValuesMap.put("MTCH_HB2", 3);
            modelValuesMap.put("MTCH_TTLG_ASN", 5);
            modelValuesMap.put("MTCH_T12G12", 1);
            modelValuesMap.put("MTCH_TTLGFLTW5", 1);
            modelValuesMap.put("MTCH_FTS", 1);
            modelValuesMap.put("MTCH_DC2", 1);
            modelValuesMap.put("MTCH_TTLG_ASN2", 2);
            modelValuesMap.put("MTCH_T1TTLG", 4);
            modelValuesMap.put("MTCH_MGI", 1);
            modelValuesMap.put("MTCH_T12G", 1);
            modelValuesMap.put("MTCH_DC1", 1);
            modelValuesMap.put("MTCH_T1G1", 1);
            modelValuesMap.put("MTCH_TTLGOE", 1);
            modelValuesMap.put("MTCH_T1G12", 1);
            modelValuesMap.put("MTCH_TTLGFLTW6", 1);
            modelValuesMap.put("MTCH_T2G12", 1);
            modelValuesMap.put("MTCH_T1TTLGOE", 1);
            modelValuesMap.put("MTCH_R2", 1);
            modelValuesMap.put("MTCH_T1G2", 1);
            modelValuesMap.put("MTCH_T12G1", 1);
            modelValuesMap.put("MTCH_R", 1);
            modelValuesMap.put("MTCH_T2TTLG", 4);
            modelValuesMap.put("MTCH_T12G1OR2", 1);

            return modelValuesMap;
        }
    }

    public static class MediumStrategy implements MarketModelsStrategy {
        @Override
        public Map<String, Integer> getMarketModelsMap() {
            Map<String, Integer> modelValuesMap = new HashMap<>();

            modelValuesMap.put("MTCH_HB_ASN2", 4);
            modelValuesMap.put("MTCH_TXG12", 1);
            modelValuesMap.put("MTCH_TTLG1", 4);
            modelValuesMap.put("MTCH_XOV", 2);
            modelValuesMap.put("MTCH_TTLGOE1", 1);
            modelValuesMap.put("MTCH_T12G2", 1);
            modelValuesMap.put("MTCH_FTSG", 3);
            modelValuesMap.put("MTCH_TTLG2", 4);
            modelValuesMap.put("MTCH_TTLGOE2", 1);
            modelValuesMap.put("MTCH_LTSH1", 1);
            modelValuesMap.put("MTCH_T2G1", 1);
            modelValuesMap.put("MTCH_T12GW1", 1);
            modelValuesMap.put("MTCH_T1WUND", 2);
            modelValuesMap.put("MTCH_T1W1OR2", 1);
            modelValuesMap.put("MTCH_T2W1OR2", 1);
            modelValuesMap.put("MTCH_T12G12", 1);
            modelValuesMap.put("MTCH_SD", 1);
            modelValuesMap.put("MTCH_T2WDOV", 2);
            modelValuesMap.put("MTCH_TIMEFG", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN1", 2);
            modelValuesMap.put("MTCH_T2WM", 3);
            modelValuesMap.put("MTCH_TEWM", 3);
            modelValuesMap.put("MTCH_T1NGI", 3);
            modelValuesMap.put("MTCH_T12G", 1);
            modelValuesMap.put("MTCH_T2TTLG2", 3);
            modelValuesMap.put("MTCH_TTLG_ASN2", 3);
            modelValuesMap.put("MTCH_T2WUND", 2);
            modelValuesMap.put("MTCH_T2TTLG1", 3);
            modelValuesMap.put("MTCH_T1TTLGFLT2", 1);
            modelValuesMap.put("MTCH_R1_R2", 1);
            modelValuesMap.put("MTCH_T1TTLG_ASN2", 2);
            modelValuesMap.put("MTCH_T12GUND", 2);
            modelValuesMap.put("MTCH_T2NGI", 3);
            modelValuesMap.put("MTCH_T2G12", 1);
            modelValuesMap.put("MTCH_TTLGFLT2W4", 1);
            modelValuesMap.put("MTCH_T1G2", 1);
            modelValuesMap.put("MTCH_T1WOV", 2);
            modelValuesMap.put("MTCH_T1TTLG1", 3);
            modelValuesMap.put("MTCH_TTLGFLT1W4", 1);
            modelValuesMap.put("MTCH_T1OR2NGUND", 1);
            modelValuesMap.put("MTCH_CSDYN", 1);
            modelValuesMap.put("MTCH_T2TTLGFLT1", 1);
            modelValuesMap.put("MTCH_TTLG", 12);
            modelValuesMap.put("MTCH_T12GWX2", 1);
            modelValuesMap.put("MTCH_TEGNM", 2);
            modelValuesMap.put("MTCH_T2TTLGOE", 1);
            modelValuesMap.put("MTCH_T1ORT2WUND", 2);
            modelValuesMap.put("MTCH_T2WOV", 2);
            modelValuesMap.put("MTCH_T1WDOV", 2);
            modelValuesMap.put("MTCH_X1AND2", 1);
            modelValuesMap.put("MTCH_LTSH2", 1);
            modelValuesMap.put("MTCH_T1W1ORW", 1);
            modelValuesMap.put("MTCH_T2GNM", 2);
            modelValuesMap.put("MTCH_T2W1AND2", 1);
            modelValuesMap.put("MTCH_T1TTLG2", 3);
            modelValuesMap.put("MTCH_T12GW1X", 1);
            modelValuesMap.put("MTCH_T1ORT2WOV", 2);
            modelValuesMap.put("MTCH_T1G", 1);
            modelValuesMap.put("MTCH_T12GNM", 1);
            modelValuesMap.put("MTCH_T2WDUND", 2);
            modelValuesMap.put("MTCH_TTLGFLTW5", 1);
            modelValuesMap.put("MTCH_MGI", 1);
            modelValuesMap.put("MTCH_T2TTLGFLTW3", 1);
            modelValuesMap.put("MTCH_TTLG12O15", 1);
            modelValuesMap.put("MTCH_T1TTLGFLTW3", 1);
            modelValuesMap.put("MTCH_T1TTLG_ASN1", 2);
            modelValuesMap.put("MTCH_T1G1", 1);
            modelValuesMap.put("MTCH_TTLG12U15", 1);
            modelValuesMap.put("MTCH_T1WM", 3);
            modelValuesMap.put("MTCH_T1GNM", 2);
            modelValuesMap.put("MTCH_TTLGFLTW6", 1);
            modelValuesMap.put("MTCH_HB_ASN", 8);
            modelValuesMap.put("MTCH_T1WDUND", 2);
            modelValuesMap.put("MTCH_DR", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN", 2);
            modelValuesMap.put("MTCH_HB1", 7);
            modelValuesMap.put("MTCH_T1TTLG_ASN", 2);
            modelValuesMap.put("MTCH_T2W0", 1);
            modelValuesMap.put("MTCH_TTLGFLT1W3", 1);
            modelValuesMap.put("MTCH_FTSH2", 1);
            modelValuesMap.put("MTCH_T12GOV", 2);
            modelValuesMap.put("MTCH_CS", 1);
            modelValuesMap.put("MTCH_T1TTLGFLTW4", 1);
            modelValuesMap.put("MTCH_TEWFB", 1);
            modelValuesMap.put("MTCH_HB2", 7);
            modelValuesMap.put("MTCH_T2TTLGFLT2", 1);
            modelValuesMap.put("MTCH_T1W1AND2", 1);
            modelValuesMap.put("MTCH_TTLGFLT2W3", 1);
            modelValuesMap.put("MTCH_DC2", 1);
            modelValuesMap.put("MTCH_T1TTLG", 6);
            modelValuesMap.put("MTCH_T1W0", 1);
            modelValuesMap.put("MTCH_TEW0", 1);
            modelValuesMap.put("MTCH_TIMELG", 1);
            modelValuesMap.put("MTCH_XUND", 2);
            modelValuesMap.put("MTCH_T2TTLGFLTW4", 1);
            modelValuesMap.put("MTCH_TTLGOE", 1);
            modelValuesMap.put("MTCH_TBG", 10);
            modelValuesMap.put("MTCH_TTLG_ASN", 8);
            modelValuesMap.put("MTCH_T1TTLGOE", 1);
            modelValuesMap.put("MTCH_R2", 1);
            modelValuesMap.put("MTCH_R", 1);
            modelValuesMap.put("MTCH_X1OR2", 1);
            modelValuesMap.put("MTCH_T12GWX", 1);
            modelValuesMap.put("MTCH_T1WFB", 1);
            modelValuesMap.put("MTCH_T2G", 1);
            modelValuesMap.put("MTCH_T2G2", 1);
            modelValuesMap.put("MTCH_TEAGNM", 4);
            modelValuesMap.put("MTCH_HB", 7);
            modelValuesMap.put("MTCH_HB_ASN1", 4);
            modelValuesMap.put("MTCH_DC", 1);
            modelValuesMap.put("MTCH_T12GW2", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN2", 2);
            modelValuesMap.put("MTCH_R1", 1);
            modelValuesMap.put("MTCH_T12GW12", 1);
            modelValuesMap.put("MTCH_LTS", 1);
            modelValuesMap.put("MTCH_TTLG_ASN1", 3);
            modelValuesMap.put("MTCH_FTSH1", 1);
            modelValuesMap.put("MTCH_T2W1ORW", 1);
            modelValuesMap.put("MTCH_X1ORX", 1);
            modelValuesMap.put("MTCH_FTS", 1);
            modelValuesMap.put("MTCH_DC1", 1);
            modelValuesMap.put("MTCH_T1G12", 1);
            modelValuesMap.put("MTCH_T12G1", 1);
            modelValuesMap.put("MTCH_T1TTLGFLT1", 1);
            modelValuesMap.put("MTCH_T2TTLG", 6);
            modelValuesMap.put("MTCH_T2WFB", 1);
            modelValuesMap.put("MTCH_T12G1OR2", 1);

            return modelValuesMap;
        }
    }

    public static class HighStrategy implements MarketModelsStrategy {
        @Override
        public Map<String, Integer> getMarketModelsMap() {
            Map<String, Integer> modelValuesMap = new HashMap<>();

            modelValuesMap.put("MTCH_TTLG1", 7);
            modelValuesMap.put("MTCH_TTLGOE1", 1);
            modelValuesMap.put("MTCH_MGIT2", 1);
            modelValuesMap.put("MTCH_FGI", 1);
            modelValuesMap.put("MTCH_XOV", 3);
            modelValuesMap.put("MTCH_HB_ASN2", 4);
            modelValuesMap.put("MTCH_TXG12", 1);
            modelValuesMap.put("MTCH_T12G2", 1);
            modelValuesMap.put("MTCH_FTSG", 3);
            modelValuesMap.put("MTCH_MGIT1", 1);
            modelValuesMap.put("MTCH_TTLG2", 8);
            modelValuesMap.put("MTCH_T12G2W2", 1);
            modelValuesMap.put("MTCH_LTSH1", 1);
            modelValuesMap.put("MTCH_T2G2W2UND", 1);
            modelValuesMap.put("MTCH_TTLGOE2", 1);
            modelValuesMap.put("MTCH_T2G1", 1);
            modelValuesMap.put("MTCH_T12GW1", 1);
            modelValuesMap.put("MTCH_T1WUND", 3);
            modelValuesMap.put("MTCH_T1W1OR2", 1);
            modelValuesMap.put("MTCH_T2W1OR2", 1);
            modelValuesMap.put("MTCH_TTLGM", 1);
            modelValuesMap.put("MTCH_T12G12", 1);
            modelValuesMap.put("MTCH_SD", 1);
            modelValuesMap.put("MTCH_XG1W1UND", 1);
            modelValuesMap.put("MTCH_T2WDOV", 3);
            modelValuesMap.put("MTCH_TIMEFG", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN1", 2);
            modelValuesMap.put("MTCH_T2WM", 3);
            modelValuesMap.put("MTCH_TEWM", 3);
            modelValuesMap.put("MTCH_T2G2W2OV", 1);
            modelValuesMap.put("MTCH_T1NGI", 3);
            modelValuesMap.put("MTCH_XG1W1OV", 1);
            modelValuesMap.put("MTCH_T12G", 1);
            modelValuesMap.put("MTCH_T2TTLG2", 4);
            modelValuesMap.put("MTCH_TTLG_ASN2", 4);
            modelValuesMap.put("MTCH_T2WUND", 3);
            modelValuesMap.put("MTCH_T2TTLG1", 4);
            modelValuesMap.put("MTCH_T1TTLGFLT2", 1);
            modelValuesMap.put("MTCH_R1_R2", 1);
            modelValuesMap.put("MTCH_XG2W2OV", 1);
            modelValuesMap.put("MTCH_T1TTLG_ASN2", 2);
            modelValuesMap.put("MTCH_T12GUND", 3);
            modelValuesMap.put("MTCH_T2NGI", 3);
            modelValuesMap.put("MTCH_T2G1W1UND", 1);
            modelValuesMap.put("MTCH_T2G12", 1);
            modelValuesMap.put("MTCH_TTLGFLT2W4", 1);
            modelValuesMap.put("MTCH_T1G2", 1);
            modelValuesMap.put("MTCH_T1WOV", 3);
            modelValuesMap.put("MTCH_XG2W2UND", 1);
            modelValuesMap.put("MTCH_T1TTLG1", 4);
            modelValuesMap.put("MTCH_T12G2W1X", 1);
            modelValuesMap.put("MTCH_FTS1_W1", 1);
            modelValuesMap.put("MTCH_TTLGFLT1W4", 1);
            modelValuesMap.put("MTCH_T1OR2NGUND", 2);
            modelValuesMap.put("MTCH_TTLG", 12);
            modelValuesMap.put("MTCH_CSDYN", 1);
            modelValuesMap.put("MTCH_T2TTLGFLT1", 1);
            modelValuesMap.put("MTCH_T12GWX2", 1);
            modelValuesMap.put("MTCH_TEGNM", 2);
            modelValuesMap.put("MTCH_T2TTLGOE", 1);
            modelValuesMap.put("MTCH_T1ORT2WUND", 3);
            modelValuesMap.put("MTCH_T1XG1W1UND", 1);
            modelValuesMap.put("MTCH_T2WOV", 3);
            modelValuesMap.put("MTCH_T1WDOV", 3);
            modelValuesMap.put("MTCH_X1AND2", 1);
            modelValuesMap.put("MTCH_LTSH2", 1);
            modelValuesMap.put("MTCH_T1W1ORW", 1);
            modelValuesMap.put("MTCH_T2GNM", 2);
            modelValuesMap.put("MTCH_FTS2_W1", 1);
            modelValuesMap.put("MTCH_T2W1AND2", 1);
            modelValuesMap.put("MTCH_T1TTLG2", 4);
            modelValuesMap.put("MTCH_T12GW1X", 1);
            modelValuesMap.put("MTCH_T1ORT2WOV", 3);
            modelValuesMap.put("MTCH_T1G", 1);
            modelValuesMap.put("MTCH_T12GNM", 1);
            modelValuesMap.put("MTCH_FTS1_WX", 1);
            modelValuesMap.put("MTCH_T2WDUND", 3);
            modelValuesMap.put("MTCH_T12G1W12", 1);
            modelValuesMap.put("MTCH_TTLGFLTW5", 1);
            modelValuesMap.put("MTCH_FTS1_W2", 1);
            modelValuesMap.put("MTCH_MGI", 1);
            modelValuesMap.put("MTCH_T2XG1W1UND", 1);
            modelValuesMap.put("MTCH_T2TTLGFLTW3", 1);
            modelValuesMap.put("MTCH_T12G1W2", 1);
            modelValuesMap.put("MTCH_TTLG12O15", 1);
            modelValuesMap.put("MTCH_T1TTLGFLTW3", 1);
            modelValuesMap.put("MTCH_T1TTLG_ASN1", 2);
            modelValuesMap.put("MTCH_T1G1", 1);
            modelValuesMap.put("MTCH_TTLG12U15", 1);
            modelValuesMap.put("MTCH_T1WM", 3);
            modelValuesMap.put("MTCH_T1GNM", 2);
            modelValuesMap.put("MTCH_TTLGFLTW6", 1);
            modelValuesMap.put("MTCH_HB_ASN", 8);
            modelValuesMap.put("MTCH_T2XG1W1OV", 1);
            modelValuesMap.put("MTCH_T1WDUND", 3);
            modelValuesMap.put("MTCH_DR", 1);
            modelValuesMap.put("MTCH_TTLGM_TIMEINT", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN", 4);
            modelValuesMap.put("MTCH_T2XG2W2OV", 1);
            modelValuesMap.put("MTCH_HB1", 7);
            modelValuesMap.put("MTCH_T1G2W2UND", 1);
            modelValuesMap.put("MTCH_T1TTLG_ASN", 4);
            modelValuesMap.put("MTCH_T2W0", 1);
            modelValuesMap.put("MTCH_T1G2W2OV", 1);
            modelValuesMap.put("MTCH_TTLGFLT1W3", 1);
            modelValuesMap.put("MTCH_T12G1W1OV", 1);
            modelValuesMap.put("MTCH_FTSH2", 1);
            modelValuesMap.put("MTCH_T12GOV", 3);
            modelValuesMap.put("MTCH_TTLGOE", 1);
            modelValuesMap.put("MTCH_CS", 1);
            modelValuesMap.put("MTCH_CSW2DYN", 1);
            modelValuesMap.put("MTCH_T1TTLGFLTW4", 1);
            modelValuesMap.put("MTCH_T12G2W1", 1);
            modelValuesMap.put("MTCH_FTS2_WX", 1);
            modelValuesMap.put("MTCH_TEWFB", 1);
            modelValuesMap.put("MTCH_HB2", 7);
            modelValuesMap.put("MTCH_T2TTLGFLT2", 1);
            modelValuesMap.put("MTCH_T1W1AND2", 1);
            modelValuesMap.put("MTCH_TTLGFLT2W3", 1);
            modelValuesMap.put("MTCH_FTS2_W2", 1);
            modelValuesMap.put("MTCH_CSW1DYN", 1);
            modelValuesMap.put("MTCH_DC2", 1);
            modelValuesMap.put("MTCH_T1TTLG", 7);
            modelValuesMap.put("MTCH_T1W0", 1);
            modelValuesMap.put("MTCH_T12G1WX", 1);
            modelValuesMap.put("MTCH_T12G2W12", 1);
            modelValuesMap.put("MTCH_T1TTLGOE", 1);
            modelValuesMap.put("MTCH_TEW0", 1);
            modelValuesMap.put("MTCH_TIMELG", 1);
            modelValuesMap.put("MTCH_T2TTLGFLTW4", 1);
            modelValuesMap.put("MTCH_XUND", 3);
            modelValuesMap.put("MTCH_T12G1W1", 1);
            modelValuesMap.put("MTCH_TBG", 10);
            modelValuesMap.put("MTCH_TTLG_ASN", 8);
            modelValuesMap.put("MTCH_R2", 1);
            modelValuesMap.put("MTCH_R", 1);
            modelValuesMap.put("MTCH_T12G2W2X", 1);
            modelValuesMap.put("MTCH_X1OR2", 1);
            modelValuesMap.put("MTCH_T12G2W2OV", 1);
            modelValuesMap.put("MTCH_T12GWX", 1);
            modelValuesMap.put("MTCH_T1WFB", 1);
            modelValuesMap.put("MTCH_T1XG2W2OV", 1);
            modelValuesMap.put("MTCH_T2XG2W2UND", 1);
            modelValuesMap.put("MTCH_T1G1W1UND", 1);
            modelValuesMap.put("MTCH_T2G", 1);
            modelValuesMap.put("MTCH_T2G2", 1);
            modelValuesMap.put("MTCH_TEAGNM", 4);
            modelValuesMap.put("MTCH_HB", 7);
            modelValuesMap.put("MTCH_HB_ASN1", 4);
            modelValuesMap.put("MTCH_T12GW2", 1);
            modelValuesMap.put("MTCH_DC", 1);
            modelValuesMap.put("MTCH_T12G1W1UND", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN2", 2);
            modelValuesMap.put("MTCH_R1", 1);
            modelValuesMap.put("MTCH_T1G1W1OV", 1);
            modelValuesMap.put("MTCH_T12GW12", 1);
            modelValuesMap.put("MTCH_LTS", 1);
            modelValuesMap.put("MTCH_TTLG_ASN1", 4);
            modelValuesMap.put("MTCH_T12G2WX", 1);
            modelValuesMap.put("MTCH_T2G1W1OV", 1);
            modelValuesMap.put("MTCH_FTSH1", 1);
            modelValuesMap.put("MTCH_T2W1ORW", 1);
            modelValuesMap.put("MTCH_X1ORX", 1);
            modelValuesMap.put("MTCH_TTLGMOE", 1);
            modelValuesMap.put("MTCH_FTS", 1);
            modelValuesMap.put("MTCH_T1XG1W1OV", 1);
            modelValuesMap.put("MTCH_DC1", 1);
            modelValuesMap.put("MTCH_T1XG2W2UND", 1);
            modelValuesMap.put("MTCH_T12G2W2UND", 1);
            modelValuesMap.put("MTCH_T1G12", 1);
            modelValuesMap.put("MTCH_T12G1W2X", 1);
            modelValuesMap.put("MTCH_T12G1", 1);
            modelValuesMap.put("MTCH_T1TTLGFLT1", 1);
            modelValuesMap.put("MTCH_T12G1W1X", 1);
            modelValuesMap.put("MTCH_T2TTLG", 7);
            modelValuesMap.put("MTCH_T2WFB", 1);
            modelValuesMap.put("MTCH_T12G1OR2", 1);

            return modelValuesMap;
        }
    }

    public static class SuperStrategy implements MarketModelsStrategy {
        @Override
        public Map<String, Integer> getMarketModelsMap() {
            Map<String, Integer> modelValuesMap = new HashMap<>();

            modelValuesMap.put("MTCH_T1XG2W2OV", 3);
            modelValuesMap.put("MTCH_FGI", 1);
            modelValuesMap.put("MTCH_TXG12", 1);
            modelValuesMap.put("MTCH_T12G2", 1);
            modelValuesMap.put("MTCH_FTSG", 3);
            modelValuesMap.put("MTCH_T12G2W2", 1);
            modelValuesMap.put("MTCH_T2G2W2UND", 3);
            modelValuesMap.put("MTCH_T2G1", 1);
            modelValuesMap.put("MTCH_T1WUND", 4);
            modelValuesMap.put("MTCH_T2W1OR2", 1);
            modelValuesMap.put("MTCH_TTLGM", 1);
            modelValuesMap.put("MTCH_T12G12", 1);
            modelValuesMap.put("MTCH_XG1W1UND", 3);
            modelValuesMap.put("MTCH_T2WDOV", 4);
            modelValuesMap.put("MTCH_T2TTLG_ASN1", 2);
            modelValuesMap.put("MTCH_T12G2W2UND", 3);
            modelValuesMap.put("MTCH_T1_TIME_TTLG", 10);
            modelValuesMap.put("MTCH_T1NGI", 3);
            modelValuesMap.put("MTCH_T2XG1W1UND", 3);
            modelValuesMap.put("MTCH_XG1W1OV", 1);
            modelValuesMap.put("MTCH_G_TIMEINT", 6);
            modelValuesMap.put("MTCH_T2TTLG1", 4);
            modelValuesMap.put("MTCH_T1G2W2OV", 2);
            modelValuesMap.put("MTCH_T12GUND", 4);
            modelValuesMap.put("MTCH_T2NGI", 3);
            modelValuesMap.put("MTCH_T2G12", 1);
            modelValuesMap.put("MTCH_T1WOV", 4);
            modelValuesMap.put("MTCH_T1TTLG1", 4);
            modelValuesMap.put("MTCH_T12G2W1X", 1);
            modelValuesMap.put("MTCH_T2XG1W1OV", 2);
            modelValuesMap.put("MTCH_FTS1_W1", 1);
            modelValuesMap.put("MTCH_TTLGFLT1W4", 1);
            modelValuesMap.put("MTCH_CSDYN", 1);
            modelValuesMap.put("MTCH_T12GWX2", 1);
            modelValuesMap.put("MTCH_T2TTLGOE", 1);
            modelValuesMap.put("MTCH_T1ORT2WUND", 4);
            modelValuesMap.put("MTCH_T2WOV", 4);
            modelValuesMap.put("MTCH_T1WDOV", 4);
            modelValuesMap.put("MTCH_LTSH2", 1);
            modelValuesMap.put("MTCH_T2_TIME_TTLG", 10);
            modelValuesMap.put("MTCH_FTS2_W1", 1);
            modelValuesMap.put("MTCH_T2W1AND2", 1);
            modelValuesMap.put("MTCH_FTS1_WX", 1);
            modelValuesMap.put("MTCH_FTS1_W2", 1);
            modelValuesMap.put("MTCH_TTLG12O15", 1);
            modelValuesMap.put("MTCH_T12G1W1OV", 2);
            modelValuesMap.put("MTCH_T1TTLGFLTW3", 1);
            modelValuesMap.put("MTCH_T1G1W1OV", 2);
            modelValuesMap.put("MTCH_T1TTLG_ASN1", 2);
            modelValuesMap.put("MTCH_T1G1", 1);
            modelValuesMap.put("MTCH_TTLG12U15", 1);
            modelValuesMap.put("MTCH_TTLGFLTW6", 1);
            modelValuesMap.put("MTCH_HB_ASN", 8);
            modelValuesMap.put("MTCH_T1WDUND", 4);
            modelValuesMap.put("MTCH_TIME_TTLG", 14);
            modelValuesMap.put("MTCH_T1G2W2UND", 3);
            modelValuesMap.put("MTCH_T2W0", 1);
            modelValuesMap.put("MTCH_T2WM", 3);
            modelValuesMap.put("MTCH_TTLGFLT1W3", 1);
            modelValuesMap.put("MTCH_CS", 1);
            modelValuesMap.put("MTCH_T1TTLG_ASN2", 2);
            modelValuesMap.put("MTCH_T1TTLGFLTW4", 1);
            modelValuesMap.put("MTCH_T2WUND", 4);
            modelValuesMap.put("MTCH_T12G2W1", 1);
            modelValuesMap.put("MTCH_FTS2_WX", 1);
            modelValuesMap.put("MTCH_T1W1AND2", 1);
            modelValuesMap.put("MTCH_TEWM", 3);
            modelValuesMap.put("MTCH_FTS2_W2", 1);
            modelValuesMap.put("MTCH_T2G1W1UND", 3);
            modelValuesMap.put("MTCH_DC2", 1);
            modelValuesMap.put("MTCH_T1TTLG", 8);
            modelValuesMap.put("MTCH_T12G1WX", 1);
            modelValuesMap.put("MTCH_T12G2W12", 1);
            modelValuesMap.put("MTCH_T1TTLGOE", 1);
            modelValuesMap.put("MTCH_TEW0", 1);
            modelValuesMap.put("MTCH_TIMELG", 1);
            modelValuesMap.put("MTCH_XUND", 4);
            modelValuesMap.put("MTCH_HB1", 7);
            modelValuesMap.put("MTCH_T12G1W1", 1);
            modelValuesMap.put("MTCH_TBG", 10);
            modelValuesMap.put("MTCH_R2", 1);
            modelValuesMap.put("MTCH_R", 1);
            modelValuesMap.put("MTCH_T12G2W2X", 1);
            modelValuesMap.put("MTCH_T12G2W2OV", 3);
            modelValuesMap.put("MTCH_TIME_R", 4);
            modelValuesMap.put("MTCH_TIME_DC", 4);
            modelValuesMap.put("MTCH_T12GWX", 1);
            modelValuesMap.put("MTCH_T1WFB", 1);
            modelValuesMap.put("MTCH_TIME_HB", 7);
            modelValuesMap.put("MTCH_T2XG2W2UND", 3);
            modelValuesMap.put("MTCH_T2G", 1);
            modelValuesMap.put("MTCH_T2G2", 1);
            modelValuesMap.put("MTCH_TEAGNM", 4);
            modelValuesMap.put("MTCH_DC", 1);
            modelValuesMap.put("MTCH_T12GW12", 1);
            modelValuesMap.put("MTCH_T1WM", 3);
            modelValuesMap.put("MTCH_TTLG_ASN1", 4);
            modelValuesMap.put("MTCH_T12G2WX", 1);
            modelValuesMap.put("MTCH_T2G1W1OV", 2);
            modelValuesMap.put("MTCH_FTSH1", 1);
            modelValuesMap.put("MTCH_HB", 7);
            modelValuesMap.put("MTCH_X1ORX", 1);
            modelValuesMap.put("MTCH_TTLGMOE", 1);
            modelValuesMap.put("MTCH_T1XG1W1OV", 2);
            modelValuesMap.put("MTCH_T1XG2W2UND", 3);
            modelValuesMap.put("MTCH_T1G12", 1);
            modelValuesMap.put("MTCH_T2G2W2OV", 2);
            modelValuesMap.put("MTCH_T12G1W2X", 1);
            modelValuesMap.put("MTCH_T12G1", 1);
            modelValuesMap.put("MTCH_T1TTLGFLT1", 1);
            modelValuesMap.put("MTCH_T12G1W1X", 1);
            modelValuesMap.put("MTCH_T2TTLG", 8);
            modelValuesMap.put("MTCH_HB_ASN2", 4);
            modelValuesMap.put("MTCH_T2WFB", 1);
            modelValuesMap.put("MTCH_TTLG1", 7);
            modelValuesMap.put("MTCH_TTLGOE1", 1);
            modelValuesMap.put("MTCH_MGIT2", 1);
            modelValuesMap.put("MTCH_XOV", 3);
            modelValuesMap.put("MTCH_MGIT1", 1);
            modelValuesMap.put("MTCH_TTLG2", 8);
            modelValuesMap.put("MTCH_LTSH1", 1);
            modelValuesMap.put("MTCH_TTLGOE2", 1);
            modelValuesMap.put("MTCH_T12GW1", 1);
            modelValuesMap.put("MTCH_T1W1OR2", 1);
            modelValuesMap.put("MTCH_SD", 1);
            modelValuesMap.put("MTCH_TIMEFG", 1);
            modelValuesMap.put("MTCH_T12G", 1);
            modelValuesMap.put("MTCH_T2TTLG2", 4);
            modelValuesMap.put("MTCH_TTLG_ASN2", 4);
            modelValuesMap.put("MTCH_T1TTLGFLT2", 1);
            modelValuesMap.put("MTCH_R1_R2", 1);
            modelValuesMap.put("MTCH_XG2W2OV", 1);
            modelValuesMap.put("MTCH_TTLGFLT2W4", 1);
            modelValuesMap.put("MTCH_T1G2", 1);
            modelValuesMap.put("MTCH_XG2W2UND", 3);
            modelValuesMap.put("MTCH_T1OR2NGUND", 4);
            modelValuesMap.put("MTCH_TTLG", 12);
            modelValuesMap.put("MTCH_T2TTLGFLT1", 1);
            modelValuesMap.put("MTCH_TEGNM", 3);
            modelValuesMap.put("MTCH_T1XG1W1UND", 3);
            modelValuesMap.put("MTCH_X1AND2", 1);
            modelValuesMap.put("MTCH_T1W1ORW", 1);
            modelValuesMap.put("MTCH_T2GNM", 2);
            modelValuesMap.put("MTCH_T1TTLG2", 4);
            modelValuesMap.put("MTCH_T12GW1X", 1);
            modelValuesMap.put("MTCH_T1ORT2WOV", 4);
            modelValuesMap.put("MTCH_T1G", 1);
            modelValuesMap.put("MTCH_T12GNM", 1);
            modelValuesMap.put("MTCH_T2WDUND", 4);
            modelValuesMap.put("MTCH_T12G1W12", 1);
            modelValuesMap.put("MTCH_TTLGFLTW5", 1);
            modelValuesMap.put("MTCH_MGI", 1);
            modelValuesMap.put("MTCH_T2TTLGFLTW3", 1);
            modelValuesMap.put("MTCH_T12G1W2", 1);
            modelValuesMap.put("MTCH_T1G1W1UND", 3);
            modelValuesMap.put("MTCH_T1GNM", 2);
            modelValuesMap.put("MTCH_T2XG2W2OV", 3);
            modelValuesMap.put("MTCH_DR", 1);
            modelValuesMap.put("MTCH_TTLGM_TIMEINT", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN", 4);
            modelValuesMap.put("MTCH_T1TTLG_ASN", 4);
            modelValuesMap.put("MTCH_FTSH2", 1);
            modelValuesMap.put("MTCH_T12GOV", 4);
            modelValuesMap.put("MTCH_TTLGOE", 1);
            modelValuesMap.put("MTCH_CSW2DYN", 1);
            modelValuesMap.put("MTCH_TEWFB", 1);
            modelValuesMap.put("MTCH_HB2", 7);
            modelValuesMap.put("MTCH_T2TTLGFLT2", 1);
            modelValuesMap.put("MTCH_TTLGFLT2W3", 1);
            modelValuesMap.put("MTCH_CSW1DYN", 1);
            modelValuesMap.put("MTCH_T1W0", 1);
            modelValuesMap.put("MTCH_T2TTLGFLTW4", 1);
            modelValuesMap.put("MTCH_TTLG_ASN", 8);
            modelValuesMap.put("MTCH_X1OR2", 1);
            modelValuesMap.put("MTCH_T12G1W1UND", 3);
            modelValuesMap.put("MTCH_HB_ASN1", 4);
            modelValuesMap.put("MTCH_T12GW2", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN2", 2);
            modelValuesMap.put("MTCH_R1", 1);
            modelValuesMap.put("MTCH_LTS", 1);
            modelValuesMap.put("MTCH_T2W1ORW", 1);
            modelValuesMap.put("MTCH_FTS", 1);
            modelValuesMap.put("MTCH_DC1", 1);
            modelValuesMap.put("MTCH_T12G1OR2", 1);

            return modelValuesMap;
        }
    }

    public static class Super2Strategy implements MarketModelsStrategy {
        @Override
        public Map<String, Integer> getMarketModelsMap() {
            Map<String, Integer> modelValuesMap = new HashMap<>();

            modelValuesMap.put("MTCH_T1XG2W2OV", 2);
            modelValuesMap.put("MTCH_FGI", 1);
            modelValuesMap.put("MTCH_TXG12", 1);
            modelValuesMap.put("MTCH_T12G2", 1);
            modelValuesMap.put("MTCH_FTSG", 3);
            modelValuesMap.put("MTCH_T12G2W2", 1);
            modelValuesMap.put("MTCH_T2G2W2UND", 2);
            modelValuesMap.put("MTCH_T2G1", 1);
            modelValuesMap.put("MTCH_T1WUND", 4);
            modelValuesMap.put("MTCH_T2W1OR2", 1);
            modelValuesMap.put("MTCH_TTLGM", 1);
            modelValuesMap.put("MTCH_T12G12", 1);
            modelValuesMap.put("MTCH_XG1W1UND", 2);
            modelValuesMap.put("MTCH_T2WDOV", 4);
            modelValuesMap.put("MTCH_T2TTLG_ASN1", 2);
            modelValuesMap.put("MTCH_T1_TIME_TTLG", 10);
            modelValuesMap.put("MTCH_T1NGI", 3);
            modelValuesMap.put("MTCH_XG1W1OV", 1);
            modelValuesMap.put("MTCH_T2XG1W1UND", 2);
            modelValuesMap.put("MTCH_T12G2W2UND", 2);
            modelValuesMap.put("MTCH_G_TIMEINT", 6);
            modelValuesMap.put("MTCH_T2TTLG1", 4);
            modelValuesMap.put("MTCH_T1G2W2OV", 2);
            modelValuesMap.put("MTCH_T12GUND", 4);
            modelValuesMap.put("MTCH_T2NGI", 3);
            modelValuesMap.put("MTCH_T2G12", 1);
            modelValuesMap.put("MTCH_T1WOV", 4);
            modelValuesMap.put("MTCH_T1TTLG1", 4);
            modelValuesMap.put("MTCH_T12G2W1X", 1);
            modelValuesMap.put("MTCH_T2XG1W1OV", 2);
            modelValuesMap.put("MTCH_FTS1_W1", 1);
            modelValuesMap.put("MTCH_TTLGFLT1W4", 1);
            modelValuesMap.put("MTCH_CSDYN", 1);
            modelValuesMap.put("MTCH_T12GWX2", 1);
            modelValuesMap.put("MTCH_T2TTLGOE", 1);
            modelValuesMap.put("MTCH_T1ORT2WUND", 4);
            modelValuesMap.put("MTCH_T2WOV", 4);
            modelValuesMap.put("MTCH_T1WDOV", 4);
            modelValuesMap.put("MTCH_LTSH2", 1);
            modelValuesMap.put("MTCH_T2_TIME_TTLG", 10);
            modelValuesMap.put("MTCH_FTS2_W1", 1);
            modelValuesMap.put("MTCH_T2W1AND2", 1);
            modelValuesMap.put("MTCH_FTS1_WX", 1);
            modelValuesMap.put("MTCH_FTS1_W2", 1);
            modelValuesMap.put("MTCH_TTLG12O15", 1);
            modelValuesMap.put("MTCH_T12G1W1OV", 2);
            modelValuesMap.put("MTCH_T1TTLGFLTW3", 1);
            modelValuesMap.put("MTCH_T1G1W1OV", 2);
            modelValuesMap.put("MTCH_T1TTLG_ASN1", 2);
            modelValuesMap.put("MTCH_T1G1", 1);
            modelValuesMap.put("MTCH_TTLG12U15", 1);
            modelValuesMap.put("MTCH_TTLGFLTW6", 1);
            modelValuesMap.put("MTCH_HB_ASN", 8);
            modelValuesMap.put("MTCH_T1WDUND", 4);
            modelValuesMap.put("MTCH_TIME_TTLG", 14);
            modelValuesMap.put("MTCH_T1G2W2UND", 2);
            modelValuesMap.put("MTCH_T2W0", 1);
            modelValuesMap.put("MTCH_T2WM", 3);
            modelValuesMap.put("MTCH_TTLGFLT1W3", 1);
            modelValuesMap.put("MTCH_CS", 1);
            modelValuesMap.put("MTCH_T1TTLG_ASN2", 2);
            modelValuesMap.put("MTCH_T1TTLGFLTW4", 1);
            modelValuesMap.put("MTCH_T2WUND", 4);
            modelValuesMap.put("MTCH_T12G2W1", 1);
            modelValuesMap.put("MTCH_FTS2_WX", 1);
            modelValuesMap.put("MTCH_T1W1AND2", 1);
            modelValuesMap.put("MTCH_TEWM", 3);
            modelValuesMap.put("MTCH_FTS2_W2", 1);
            modelValuesMap.put("MTCH_DC2", 1);
            modelValuesMap.put("MTCH_T2G1W1UND", 2);
            modelValuesMap.put("MTCH_T1TTLG", 8);
            modelValuesMap.put("MTCH_T12G1WX", 1);
            modelValuesMap.put("MTCH_T12G2W12", 1);
            modelValuesMap.put("MTCH_T1TTLGOE", 1);
            modelValuesMap.put("MTCH_TEW0", 1);
            modelValuesMap.put("MTCH_TIMELG", 1);
            modelValuesMap.put("MTCH_XUND", 4);
            modelValuesMap.put("MTCH_HB1", 7);
            modelValuesMap.put("MTCH_T12G1W1", 1);
            modelValuesMap.put("MTCH_TBG", 10);
            modelValuesMap.put("MTCH_R2", 1);
            modelValuesMap.put("MTCH_R", 1);
            modelValuesMap.put("MTCH_T12G2W2X", 1);
            modelValuesMap.put("MTCH_T12G2W2OV", 2);
            modelValuesMap.put("MTCH_TIME_R", 4);
            modelValuesMap.put("MTCH_TIME_DC", 4);
            modelValuesMap.put("MTCH_T12GWX", 1);
            modelValuesMap.put("MTCH_T1WFB", 1);
            modelValuesMap.put("MTCH_TIME_HB", 7);
            modelValuesMap.put("MTCH_T2XG2W2UND", 2);
            modelValuesMap.put("MTCH_T2G", 1);
            modelValuesMap.put("MTCH_T2G2", 1);
            modelValuesMap.put("MTCH_TEAGNM", 4);
            modelValuesMap.put("MTCH_DC", 1);
            modelValuesMap.put("MTCH_T12GW12", 1);
            modelValuesMap.put("MTCH_T1WM", 3);
            modelValuesMap.put("MTCH_TTLG_ASN1", 4);
            modelValuesMap.put("MTCH_T12G2WX", 1);
            modelValuesMap.put("MTCH_T2G1W1OV", 2);
            modelValuesMap.put("MTCH_FTSH1", 1);
            modelValuesMap.put("MTCH_HB", 7);
            modelValuesMap.put("MTCH_X1ORX", 1);
            modelValuesMap.put("MTCH_TTLGMOE", 1);
            modelValuesMap.put("MTCH_T1XG1W1OV", 2);
            modelValuesMap.put("MTCH_T1XG2W2UND", 2);
            modelValuesMap.put("MTCH_T1G12", 1);
            modelValuesMap.put("MTCH_T2G2W2OV", 2);
            modelValuesMap.put("MTCH_T12G1W2X", 1);
            modelValuesMap.put("MTCH_T12G1", 1);
            modelValuesMap.put("MTCH_T1TTLGFLT1", 1);
            modelValuesMap.put("MTCH_T12G1W1X", 1);
            modelValuesMap.put("MTCH_T2TTLG", 8);
            modelValuesMap.put("MTCH_HB_ASN2", 4);
            modelValuesMap.put("MTCH_T2WFB", 1);
            modelValuesMap.put("MTCH_TTLG1", 7);
            modelValuesMap.put("MTCH_TTLGOE1", 1);
            modelValuesMap.put("MTCH_MGIT2", 1);
            modelValuesMap.put("MTCH_XOV", 3);
            modelValuesMap.put("MTCH_MGIT1", 1);
            modelValuesMap.put("MTCH_TTLG2", 8);
            modelValuesMap.put("MTCH_LTSH1", 1);
            modelValuesMap.put("MTCH_TTLGOE2", 1);
            modelValuesMap.put("MTCH_T12GW1", 1);
            modelValuesMap.put("MTCH_T1W1OR2", 1);
            modelValuesMap.put("MTCH_SD", 1);
            modelValuesMap.put("MTCH_TIMEFG", 1);
            modelValuesMap.put("MTCH_T12G", 1);
            modelValuesMap.put("MTCH_T2TTLG2", 4);
            modelValuesMap.put("MTCH_TTLG_ASN2", 4);
            modelValuesMap.put("MTCH_T1TTLGFLT2", 1);
            modelValuesMap.put("MTCH_R1_R2", 1);
            modelValuesMap.put("MTCH_XG2W2OV", 1);
            modelValuesMap.put("MTCH_TTLGFLT2W4", 1);
            modelValuesMap.put("MTCH_T1G2", 1);
            modelValuesMap.put("MTCH_XG2W2UND", 2);
            modelValuesMap.put("MTCH_T1OR2NGUND", 3);
            modelValuesMap.put("MTCH_TTLG", 12);
            modelValuesMap.put("MTCH_T2TTLGFLT1", 1);
            modelValuesMap.put("MTCH_TEGNM", 3);
            modelValuesMap.put("MTCH_T1XG1W1UND", 2);
            modelValuesMap.put("MTCH_X1AND2", 1);
            modelValuesMap.put("MTCH_T1W1ORW", 1);
            modelValuesMap.put("MTCH_T2GNM", 2);
            modelValuesMap.put("MTCH_T1TTLG2", 4);
            modelValuesMap.put("MTCH_T12GW1X", 1);
            modelValuesMap.put("MTCH_T1ORT2WOV", 4);
            modelValuesMap.put("MTCH_T1G", 1);
            modelValuesMap.put("MTCH_T12GNM", 1);
            modelValuesMap.put("MTCH_T2WDUND", 4);
            modelValuesMap.put("MTCH_T12G1W12", 1);
            modelValuesMap.put("MTCH_TTLGFLTW5", 1);
            modelValuesMap.put("MTCH_MGI", 1);
            modelValuesMap.put("MTCH_T2TTLGFLTW3", 1);
            modelValuesMap.put("MTCH_T12G1W2", 1);
            modelValuesMap.put("MTCH_T1G1W1UND", 2);
            modelValuesMap.put("MTCH_T1GNM", 2);
            modelValuesMap.put("MTCH_T2XG2W2OV", 2);
            modelValuesMap.put("MTCH_DR", 1);
            modelValuesMap.put("MTCH_TTLGM_TIMEINT", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN", 4);
            modelValuesMap.put("MTCH_T1TTLG_ASN", 4);
            modelValuesMap.put("MTCH_FTSH2", 1);
            modelValuesMap.put("MTCH_T12GOV", 4);
            modelValuesMap.put("MTCH_TTLGOE", 1);
            modelValuesMap.put("MTCH_CSW2DYN", 1);
            modelValuesMap.put("MTCH_TEWFB", 1);
            modelValuesMap.put("MTCH_HB2", 7);
            modelValuesMap.put("MTCH_T2TTLGFLT2", 1);
            modelValuesMap.put("MTCH_TTLGFLT2W3", 1);
            modelValuesMap.put("MTCH_CSW1DYN", 1);
            modelValuesMap.put("MTCH_T1W0", 1);
            modelValuesMap.put("MTCH_T2TTLGFLTW4", 1);
            modelValuesMap.put("MTCH_TTLG_ASN", 8);
            modelValuesMap.put("MTCH_X1OR2", 1);
            modelValuesMap.put("MTCH_T12G1W1UND", 2);
            modelValuesMap.put("MTCH_HB_ASN1", 4);
            modelValuesMap.put("MTCH_T12GW2", 1);
            modelValuesMap.put("MTCH_T2TTLG_ASN2", 2);
            modelValuesMap.put("MTCH_R1", 1);
            modelValuesMap.put("MTCH_LTS", 1);
            modelValuesMap.put("MTCH_T2W1ORW", 1);
            modelValuesMap.put("MTCH_FTS", 1);
            modelValuesMap.put("MTCH_DC1", 1);
            modelValuesMap.put("MTCH_T12G1OR2", 1);

            return modelValuesMap;
        }
    }
}