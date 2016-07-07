package text.korean;

import com.twitter.penguin.korean.TwitterKoreanProcessorJava;
import com.twitter.penguin.korean.tokenizer.KoreanTokenizer;
import scala.collection.Seq;
import scala.collection.convert.WrapAsJava$;
import text.korean.DataClass.*;
import text.korean.managerclass.WordDensityManager;
import text.korean.managerclass.WordInfoManager;
import text.korean.fileio.WordInfoCSVWriter;

import java.io.IOException;
import java.util.List;

/**
 * Created by parkjaesung on 2016. 6. 29..
 */
public class KoreanTextTokenizer implements SentimentTypeInterface{

    //TODO 문자열 전처리 과정 추가
    //TODO 1순위 : 시각화
    //TODO 2순위 : 분산
    private static String text =
            "청와대 홍보수석이 KBS 보도국장에게 전화를 걸어 정권에 비판적인 보도를 일일이 통제해온 사실이 드러났다. 전국언론노동조합 등 7개 언론단체가 어제 기자회견을 통해 공개한 세월호 참사 당시 이정현 홍보수석과 KBS 김시곤 보도국장의 통화 녹취록은 소문으로 전해져온 현 정권의 방송장악 실태를 그대로 보여주고 있다. 특히 이 수석의 발언은 KBS를 시청자의 알 권리를 충족하고 권력에 대한 비판감시를 수행해야 하는 공영방송이 아니라 정권의 홍보방송으로 착각하고 있는 청와대의 오도된 인식을 드러내고 있다는 점에서 문제의 심각성이 있다.\n" +
            "\n" +
            "녹취록을 보면 이 전 수석은 세월호 참사 직후인 2013년 4월21일 KBS <9시뉴스>가 해경에 대해 7건의 비판적 보도를 내보내자 보도국장에게 전화를 걸어 “지금 이 시점에 ‘해경하고 정부를 두들겨 패야지~’, 그게 맞느냐”고 불만을 표시했다. 그는 “KBS가 저렇게 보도하면 전부 다 해경 저 새끼들이 잘못해 가지고 이 어마어마한 일이 일어난 것으로 생각할 것 아니냐”고까지 했다. KBS 보도로 인해 세월호 사태의 책임이 선원들보다 해경에 초점이 맞춰지는 것에 비속어까지 섞어가며 강한 유감을 표시한 것이다.\n" +
            "\n" +
            "문제는 공영방송의 독립성과 자율성을 수호해야 할 보도국장이 청와대의 부당한 외압에 별다른 항변도 하지 못한 채 힘없이 굴복했다는 점이다. 김 전 보도국장이 “이 선배, 솔직히 우리만큼 많이 도와준 데가 어디 있느냐”고 읍소한 대목은 한숨을 자아내게 한다. 청와대의 KBS 통제가 세월호 사태 이전부터 일상적으로 행해졌고 KBS가 고분고분 청와대 지시를 받아들여 왔음을 보여주고 있기 때문이다.\n" +
            "\n" +
            "이 전 수석의 부당한 보도통제는 2014년 4월30일 KBS <9시뉴스>가 해경이 군의 투입을 통제했다는 보도를 내보낸 후 다시 이어졌다. 이 전 수석은 후속 심야프로인 <뉴스라인>의 보도 방향과 관련해 “다른 걸로 대체를 해주던지 녹음 한번만 더 해달라”고 요구했다. 이후 해군과 해경의 손발이 맞지 않아 초기 구조작업이 지연된 부분은 삭제됐다.\n" +
            "\n" +
            "이 전 수석은 “당시에 한명의 생명이라도 더 구해야 한다는 절박함에서 선 수습하고 나중에 비판하라는 취지였다”고 해명했다. 하지만 4월30일 통화 녹취록에는 이 전 수석이 “하필이면 또 세상에 (대통령이) KBS를 봤네”라며 해경을 비판하는 아이템의 교체를 요구하는 부분이 나온다. 이 전 수석의 의도가 신속한 구조보다 대통령의 불편한 심기를 염두에 둔 것임을 어렵지 않게 짐작하게 하는 대목이다.\n";

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){

        TextData textData = new TextData();

        textData.setTextData(text);
        textData.removeSpecialChar();
        textData.setTextLength();
        textData.setSentitment();
    }

}


