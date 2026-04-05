package com.advancedgears.average4mathuoa;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class ComActivity extends AppCompatActivity {
	
	private ArrayList<HashMap<String, Object>> t = new ArrayList<>();
	
	private LinearLayout linear1;
	private TextView textview1;
	private ListView listview1;
	private LinearLayout linear2;
	private TextView textview2;
	private TextView textview5;
	
	private SharedPreferences u;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.com);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		textview1 = findViewById(R.id.textview1);
		listview1 = findViewById(R.id.listview1);
		linear2 = findViewById(R.id.linear2);
		textview2 = findViewById(R.id.textview2);
		textview5 = findViewById(R.id.textview5);
		u = getSharedPreferences("u", Activity.MODE_PRIVATE);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (u.getString("del45", "").equals("1") && t.get((int)_position).get("sub").toString().contains("—>")) {
					if (t.get((int)_position).get("sub").toString().endsWith("10")) {
						u.edit().putString("add2", t.get((int)_position).get("sub").toString().substring((int)(t.get((int)_position).get("sub").toString().length() - 2), (int)(t.get((int)_position).get("sub").toString().length()))).commit();
					} else {
						u.edit().putString("add2", t.get((int)_position).get("sub").toString().substring((int)(t.get((int)_position).get("sub").toString().length() - 1), (int)(t.get((int)_position).get("sub").toString().length()))).commit();
					}
					SketchwareUtil.showMessage(getApplicationContext(), "Ο βαθμός τροποποιήθηκε");
				} else {
					u.edit().putString("add2", t.get((int)_position).get("sub").toString()).commit();
				}
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		if (u.getString("del45", "").equals("1")) {
			if (u.getString("add1", "").endsWith("10")) {
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 2), (int)(u.getString("add1", "").length())).concat(" —> 5"));
					t.add(_item);
				}
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 2), (int)(u.getString("add1", "").length())).concat(" —> 6"));
					t.add(_item);
				}
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 2), (int)(u.getString("add1", "").length())).concat(" —> 7"));
					t.add(_item);
				}
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 2), (int)(u.getString("add1", "").length())).concat(" —> 8"));
					t.add(_item);
				}
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 2), (int)(u.getString("add1", "").length())).concat(" —> 9"));
					t.add(_item);
				}
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 2), (int)(u.getString("add1", "").length())));
					t.add(_item);
				}
				u.edit().putString("add1", u.getString("add1", "").substring((int)(0), (int)(u.getString("add1", "").length() - 2))).commit();
			} else {
				if (u.getString("add1", "").endsWith("9")) {
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 5"));
						t.add(_item);
					}
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 6"));
						t.add(_item);
					}
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 7"));
						t.add(_item);
					}
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 8"));
						t.add(_item);
					}
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())));
						t.add(_item);
					}
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 10"));
						t.add(_item);
					}
				} else {
					if (u.getString("add1", "").endsWith("8")) {
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 5"));
							t.add(_item);
						}
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 6"));
							t.add(_item);
						}
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 7"));
							t.add(_item);
						}
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())));
							t.add(_item);
						}
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 9"));
							t.add(_item);
						}
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 10"));
							t.add(_item);
						}
					} else {
						if (u.getString("add1", "").endsWith("7")) {
							{
								HashMap<String, Object> _item = new HashMap<>();
								_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 5"));
								t.add(_item);
							}
							{
								HashMap<String, Object> _item = new HashMap<>();
								_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 6"));
								t.add(_item);
							}
							{
								HashMap<String, Object> _item = new HashMap<>();
								_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())));
								t.add(_item);
							}
							{
								HashMap<String, Object> _item = new HashMap<>();
								_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 8"));
								t.add(_item);
							}
							{
								HashMap<String, Object> _item = new HashMap<>();
								_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 9"));
								t.add(_item);
							}
							{
								HashMap<String, Object> _item = new HashMap<>();
								_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 10"));
								t.add(_item);
							}
						} else {
							if (u.getString("add1", "").endsWith("6")) {
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 5"));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 7"));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 8"));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 9"));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 10"));
									t.add(_item);
								}
							} else {
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 6"));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 7"));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 8"));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 9"));
									t.add(_item);
								}
								{
									HashMap<String, Object> _item = new HashMap<>();
									_item.put("sub", u.getString("add1", "").substring((int)(u.getString("add1", "").length() - 1), (int)(u.getString("add1", "").length())).concat(" —> 10"));
									t.add(_item);
								}
							}
						}
					}
				}
				u.edit().putString("add1", u.getString("add1", "").substring((int)(0), (int)(u.getString("add1", "").length() - 1))).commit();
			}
			textview5.setText("Πίσω για διαγραφή");
		} else {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("sub", "5");
				t.add(_item);
			}
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("sub", "6");
				t.add(_item);
			}
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("sub", "7");
				t.add(_item);
			}
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("sub", "8");
				t.add(_item);
			}
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("sub", "9");
				t.add(_item);
			}
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("sub", "10");
				t.add(_item);
			}
		}
		textview1.setText(u.getString("add1", ""));
		listview1.setAdapter(new Listview1Adapter(t));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		if (u.getString("t", "").equals("1")) {
			linear1.setBackgroundColor(0xFFFFF3E0);
			textview1.setTextColor(0xFF0288D1);
			textview1.setBackgroundResource(R.drawable.break_light);
			textview2.setBackgroundColor(0xFF0288D1);
			textview5.setTextColor(0xFF0288D1);
		} else {
			linear1.setBackgroundColor(0xFF000000);
			textview1.setTextColor(0xFF00B8D4);
			textview1.setBackgroundResource(R.drawable.break_dark);
		}
	}
	
	@Override
	public void onBackPressed() {
		u.edit().remove("add1").commit();
		u.edit().remove("add2").commit();
		if (u.getString("del45", "").equals("1")) {
			u.edit().remove("del45").commit();
			SketchwareUtil.showMessage(getApplicationContext(), "Το μάθημα διαγράφτηκε");
		}
		finish();
	}
	public class Listview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.picker, null);
			}
			
			final TextView textview1 = _view.findViewById(R.id.textview1);
			
			textview1.setText(t.get((int)_position).get("sub").toString());
			if (u.getString("t", "").equals("1")) {
				textview1.setTextColor(0xFFFF6F00);
				textview1.setBackgroundResource(R.drawable.bg_light);
			} else {
				textview1.setTextColor(0xFFEEFF41);
				textview1.setBackgroundResource(R.drawable.bg_dark);
			}
			
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}