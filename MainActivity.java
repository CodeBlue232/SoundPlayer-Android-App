package munyoncj14.mansfield.soundplayer;



import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button blueButton, greenButton, cyanButton, purpleButton, redButton;
	MediaPlayer cyan, blue, purple, red, green;
	int playing;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		blueButton = (Button) findViewById(R.id.btnBlue);
		blue = new MediaPlayer();
		blue = MediaPlayer.create(this, R.raw.snare);
		blueButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(blue.isPlaying()){
					blue.stop();
				}
				if(green.isPlaying()){
					green.stop();
				}
				if(cyan.isPlaying()){
					cyan.stop();
				}
				if(red.isPlaying()){
					red.pause();
				}
				if(purple.isPlaying()){
					purple.stop();
				}
				blue.start();
			}
		});
		
		greenButton = (Button) findViewById(R.id.btnGreen);
		green = new MediaPlayer();
		green = MediaPlayer.create(this, R.raw.hat2);
		greenButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				if(blue.isPlaying()){
					blue.stop();
				}
				if(green.isPlaying()){
					green.stop();
				}
				if(cyan.isPlaying()){
					cyan.stop();
				}
				if(red.isPlaying()){
					red.pause();
				}
				if(purple.isPlaying()){
					purple.stop();
				}
				green.start();
			}
			
		});
		
		redButton = (Button) findViewById(R.id.btnRed);
		red = new MediaPlayer();
		red = MediaPlayer.create(this, R.raw.song);
		redButton.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				if(blue.isPlaying()){
					blue.stop();
				}
				if(green.isPlaying()){
					green.stop();
				}
				if(cyan.isPlaying()){
					cyan.stop();
				}
				if(red.isPlaying()){
					red.pause();
				}
				if(purple.isPlaying()){
					purple.stop();
				}
				red.start();
			}
			
		});
		
		cyanButton = (Button) findViewById(R.id.btnCyan);
		cyan = new MediaPlayer();
		cyan = MediaPlayer.create(this, R.raw.bass);
		cyanButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(blue.isPlaying()){
					blue.stop();
				}
				if(green.isPlaying()){
					green.stop();
				}
				if(cyan.isPlaying()){
					cyan.stop();
				}
				if(red.isPlaying()){
					red.pause();
				}
				if(purple.isPlaying()){
					purple.stop();
				}
				cyan.start();
			}
		});
		
		purpleButton = (Button) findViewById(R.id.btnPurple);
		purple = new MediaPlayer();
		purple = MediaPlayer.create(this, R.raw.boom);
		purpleButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(blue.isPlaying()){
					blue.stop();
				}
				if(green.isPlaying()){
					green.stop();
				}
				if(cyan.isPlaying()){
					cyan.stop();
				}
				if(red.isPlaying()){
					red.pause();
				}
				if(purple.isPlaying()){
					purple.stop();
				}
				purple.start();
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
