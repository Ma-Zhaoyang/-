package WeatherAPI02;

import net.sf.json.JSONObject;


/**
 * ���ݳ�����/id��ѯ����
 * @author silk
 *
 */
public class WeatherReportByCity {
    /**
     * ���ݳ�������ȡ
     * @param cityName
     * @return
     */
    public static String excute(String cityName){
        String url=//�˴��Է���json��ʽ����ʾ��,����format=2,�Ը��ݳ�������Ϊ��,cityName��������
                "http://v.juhe.cn/weather/city="+cityName+"key=13d8f14fcc7de01a2e17e902471a9f22";
        return PureNetUtil.get(url);//ͨ���������ȡ��������
    }
    /**
     * ��ȡ���������е�һ������ʾ��,�˴��Ի�ȡ�����¶�Ϊ��
     * "temperature": "8��~20��"     �����¶�
     * @param args
     * @return 
     */
    public static String GetTodayTemperatureByCity(String city) {
        String result=excute(city);
        if(result!=null){
            JSONObject obj=JSONObject.fromObject(result);
            /*��ȡ����״̬��*/
            result=obj.getString("resultcode");
            /*���״̬����200˵���������ݳɹ�*/
            if(result!=null&&result.equals("200")){
                result=obj.getString("result");
                //��ʱresult�������ж��key,���Զ���key���б���,�õ��Ը�����
                obj=JSONObject.fromObject(result);
                //�����¶ȶ�Ӧ��key��today
                result=obj.getString("today");
                obj=JSONObject.fromObject(result);
                //�����¶ȶ�Ӧ��key��temperature
                result=obj.getString("temperature");
                return result;
            }
        }
        return result;
    }
}