package vatsals.navigationlibrary;

import android.graphics.BitmapRegionDecoder;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import br.liveo.interfaces.OnItemClickListener;
import br.liveo.interfaces.OnPrepareOptionsMenuLiveo;
import br.liveo.model.HelpLiveo;
import br.liveo.navigationliveo.NavigationLiveo;

import static android.R.attr.fragment;

public class MainActivity extends NavigationLiveo implements OnItemClickListener {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    private HelpLiveo mHelpLiveo;

    @Override
    public void onInt(Bundle savedInstanceState) {
        // User Information
        this.userName.setText("Rudson Lima");
        this.userEmail.setText("rudsonlive@gmail.com");
        this.userPhoto.setImageResource(R.drawable.ic_rudsonlive);
        this.userBackground.setImageResource(R.drawable.ic_user_background_first);

        // Creating items navigation
        mHelpLiveo = new HelpLiveo();
        mHelpLiveo.add(getString(R.string.inbox), R.drawable.a, 7);
        mHelpLiveo.addSubHeader(getString(R.string.inbox)); //Item subHeader
      //  mHelpLiveo.add(getString(R.string.inbox), R.drawable.ic_rudsonlive);
        mHelpLiveo.add(getString(R.string.inbox), R.drawable.a);
        mHelpLiveo.add(getString(R.string.inbox), R.drawable.a);
        mHelpLiveo.addSeparator(); // Item separator
        mHelpLiveo.add(getString(R.string.inbox), R.drawable.a);
        mHelpLiveo.add(getString(R.string.inbox), R.drawable.a);
        mHelpLiveo.add(getString(R.string.inbox), R.drawable.a);
        mHelpLiveo.add(getString(R.string.inbox), R.drawable.a);

        //with(this, Navigation.THEME_DARK). add theme dark
        //with(this, Navigation.THEME_LIGHT). add theme light

        OnPrepareOptionsMenuLiveo onPrepare = new OnPrepareOptionsMenuLiveo() {
            @Override
            public void onPrepareOptionsMenu(Menu menu, int position, boolean visible) {
                Toast.makeText(MainActivity.this, "this was clicked"+position, Toast.LENGTH_SHORT).show();
            }
        };

        View.OnClickListener onClickPhoto = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeDrawer();
            }
        };

        View.OnClickListener onClickFooter = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeDrawer();
            }
        };

        with(this) // default theme is dark
                .startingPosition(2) //Starting position in the list
                .addAllHelpItem(mHelpLiveo.getHelp())
                .footerItem(R.string.inbox, R.drawable.ic_rudsonlive)
                .setOnClickUser(onClickPhoto)
                .setOnPrepareOptionsMenu(onPrepare)
                .setOnClickFooter(onClickFooter)
                .removeHeader()
                .build();




    }
    @Override //The "R.id.container" should be used in "beginTransaction (). Replace"
    public void onItemClick(int position) {
//        FragmentManager mFragmentManager = getSupportFragmentManager();
//        Fragment mFragment = new fragmentA();
//
//        if (mFragment != null){
//            mFragmentManager.beginTransaction().replace(R.id.main, ).commit();
//        }
    }

}
