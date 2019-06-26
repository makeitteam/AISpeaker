package sma.rhythmtapper;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

import sma.rhythmtapper.models.Difficulty;

public class HighscoreActivity extends Activity {

    public static String PREF_FILE = "HighscorePrefFile";
    private SharedPreferences _prefs;

    /* views */
    //private ListView _highscoreView;
    //private ArrayAdapter<Highscore> _adapter;
    //private ArrayList<Highscore> _arrayOfScores = new ArrayList<Highscore>();

    private TextView _easyTxtView;
    private TextView _medTxtView;
    private TextView _hardTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
        //_highscoreView = (ListView)this.findViewById(R.id.highscore_list_view);

        _easyTxtView = (TextView)this.findViewById(R.id.highscore_txt_score_easy);
        _medTxtView = (TextView)this.findViewById(R.id.highscore_txt_score_medium);
        _hardTxtView = (TextView)this.findViewById(R.id.highscore_txt_score_hard);

        // load highscores
        _prefs = PreferenceManager.getDefaultSharedPreferences(this);

        String easyMode = String.valueOf(_prefs.getInt(Difficulty.EASY_TAG, 0));
        String mediumMode = String.valueOf(_prefs.getInt(Difficulty.MED_TAG, 0));
        String hardMode = String.valueOf(_prefs.getInt(Difficulty.HARD_TAG, 0));

        _easyTxtView.setText(easyMode);
        _medTxtView.setText(mediumMode);
        _hardTxtView.setText(hardMode);


    }
}
