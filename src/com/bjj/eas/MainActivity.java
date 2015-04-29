package com.bjj.eas;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import org.apache.commons.logging.*;

/*todo
	yoga ball
	muscle groups
	moar exercises
*/

public class MainActivity extends Activity
{
	private int equip=0;
	private Exercise current=null;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void onExercise(View v)
	{
		current=genExercise();
		setContentView(R.layout.exercise);
		TextView name=(TextView)findViewById(R.id.currentName);
		name.setText(current.name());
		
	}
	
	public Exercise genExercise()
	{
		calcEquip();
android.util.Log.d("eas","equip calced");
		return new Exercise(getString(R.string.E1));
	}
	public int calcEquip()
	{
		int eq=0;
		if( ((Switch) findViewById(R.id.atlas)).isChecked() )
			eq += Exercise.atlas;
		if( ((Switch) findViewById(R.id.dumbell)).isChecked() )
			eq += Exercise.dumbell;
		if( ((Switch) findViewById(R.id.exerciseband)).isChecked() )
			eq += Exercise.exerciseband;
		if( ((Switch) findViewById(R.id.jumprope)).isChecked() )
			eq += Exercise.jumprope;
		if( ((Switch) findViewById(R.id.kettle)).isChecked() )
			eq += Exercise.kettle;
		if( ((Switch) findViewById(R.id.medicine)).isChecked() )
			eq += Exercise.medicine;
		if( ((Switch) findViewById(R.id.pullbar)).isChecked() )
			eq += Exercise.pull;
		if( ((Switch) findViewById(R.id.strechband)).isChecked() )
			eq += Exercise.strechband;
			
		equip=eq;
		return equip;
	}
	
	public void onEquip(View v)
	{
		setContentView(R.layout.equipment);
		
	}
}
