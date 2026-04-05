package com.advancedgears.average4mathuoa;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Vibrator;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
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
import java.text.DecimalFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private double a = 0;
	private double b = 0;
	private double c = 0;
	
	private ArrayList<HashMap<String, Object>> s = new ArrayList<>();
	
	private LinearLayout linear4;
	private LinearLayout linear1;
	private TextView textview3;
	private LinearLayout linear3;
	private ListView listview1;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private TextView button1;
	private TextView button2;
	
	private Intent i = new Intent();
	private SharedPreferences u;
	private TimerTask t;
	private Vibrator v;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		linear4 = findViewById(R.id.linear4);
		linear1 = findViewById(R.id.linear1);
		textview3 = findViewById(R.id.textview3);
		linear3 = findViewById(R.id.linear3);
		listview1 = findViewById(R.id.listview1);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		button1 = findViewById(R.id.button1);
		button2 = findViewById(R.id.button2);
		u = getSharedPreferences("u", Activity.MODE_PRIVATE);
		v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		textview3.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				if (!u.getString("t", "").equals("1")) {
					button1.setTextColor(0xFF0288D1);
					button2.setTextColor(0xFF0288D1);
					button1.setBackgroundResource(R.drawable.break_light);
					button2.setBackgroundResource(R.drawable.break_light);
					linear1.setBackgroundColor(0xFFFFF3E0);
					linear4.setBackgroundColor(0xFFFFF3E0);
					textview3.setBackgroundResource(R.drawable.main_light);
					u.edit().putString("t", "1").commit();
					textview3.setTextColor(0xFFF57C00);
				} else {
					button1.setTextColor(0xFF00BCD4);
					button2.setTextColor(0xFF00BCD4);
					button1.setBackgroundResource(R.drawable.break_dark);
					button2.setBackgroundResource(R.drawable.break_dark);
					linear1.setBackgroundColor(0xFF000000);
					linear4.setBackgroundColor(0xFF000000);
					textview3.setBackgroundResource(R.drawable.main_dark);
					textview3.setTextColor(0xFFFF9800);
					u.edit().putString("t", "0").commit();
				}
				((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
				return true;
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview3.setText("Έκδοση 3.1");
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								textview3.setText("Μαθηματικό Ε.Κ.Π.Α. Μ.Ο.");
							}
						});
					}
				};
				_timer.schedule(t, (int)(500));
			}
		});
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				if (_position > 0) {
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("sub", s.get((int)_position).get("sub").toString());
						s.add((int)_position - 1, _item);
					}
					s.remove((int)(_position + 1));
					((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
				}
				c = 0;
				for(int _repeat31 = 0; _repeat31 < (int)(s.size()); _repeat31++) {
					u.edit().putString(String.valueOf((long)(c)), s.get((int)c).get("sub").toString()).commit();
					c++;
				}
				u.edit().putString("rep", String.valueOf((long)(c))).commit();
			}
		});
		
		listview1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
			@Override
			public boolean onItemLongClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				u.edit().putString("add1", s.get((int)_position).get("sub").toString()).commit();
				s.remove((int)(_position));
				((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
				if (s.size() == 0) {
					u.edit().remove("rep").commit();
				}
				c = 0;
				for(int _repeat42 = 0; _repeat42 < (int)(s.size()); _repeat42++) {
					u.edit().putString(String.valueOf((long)(c)), s.get((int)c).get("sub").toString()).commit();
					c++;
				}
				u.edit().putString("rep", String.valueOf((long)(c))).commit();
				if (s.size() > 0) {
					button2.setEnabled(true);
				} else {
					button2.setEnabled(false);
				}
				button2.setText("Υπολογισμός Μέσου Όρου (".concat(String.valueOf((long)(s.size())).concat(")")));
				u.edit().putString("del45", "1").commit();
				u.edit().putString("pos45", String.valueOf((long)(_position))).commit();
				i.setClass(getApplicationContext(), ComActivity.class);
				startActivity(i);
				return true;
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (button2.getText().toString().contains("36")) {
					v.vibrate((long)(70));
					button2.setText("36");
					if (u.getString("t", "").equals("1")) {
						button2.setTextColor(0xFFF57C00);
						textview3.setEnabled(false);
						t = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										button2.setTextColor(0xFF0288D1);
										button2.setText("Υπολογισμός Μέσου Όρου (36)");
										textview3.setEnabled(true);
									}
								});
							}
						};
						_timer.schedule(t, (int)(750));
					} else {
						button2.setTextColor(0xFFFF9800);
						textview3.setEnabled(false);
						t = new TimerTask() {
							@Override
							public void run() {
								runOnUiThread(new Runnable() {
									@Override
									public void run() {
										button2.setTextColor(0xFF00BCD4);
										button2.setText("Υπολογισμός Μέσου Όρου (36)");
										textview3.setEnabled(true);
									}
								});
							}
						};
						_timer.schedule(t, (int)(750));
					}
				} else {
					i.setClass(getApplicationContext(), PickActivity.class);
					startActivity(i);
				}
			}
		});
		
		button2.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				a = 0;
				c = 0;
				for(int _repeat13 = 0; _repeat13 < (int)(s.size()); _repeat13++) {
					if (s.get((int)c).get("sub").toString().endsWith("10")) {
						a = Double.parseDouble(s.get((int)c).get("sub").toString().substring((int)(s.get((int)c).get("sub").toString().length() - 2), (int)(s.get((int)c).get("sub").toString().length()))) + a;
					} else {
						a = Double.parseDouble(s.get((int)c).get("sub").toString().substring((int)(s.get((int)c).get("sub").toString().length() - 1), (int)(s.get((int)c).get("sub").toString().length()))) + a;
					}
					c++;
				}
				c = Math.round(1000 * (a / c));
				textview3.setText("Ο μέσος όρος χωρίς συντελεστές\nείναι ".concat(String.valueOf(c / 1000)));
				textview3.setEnabled(false);
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								textview3.setText("Μαθηματικό Ε.Κ.Π.Α. Μ.Ο.");
								textview3.setEnabled(true);
							}
						});
					}
				};
				_timer.schedule(t, (int)(2000));
				return true;
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				a = 0;
				b = 0;
				c = 0;
				for(int _repeat16 = 0; _repeat16 < (int)(s.size()); _repeat16++) {
					if (s.get((int)c).get("sub").toString().endsWith("10")) {
						a = (Double.parseDouble(s.get((int)c).get("sub").toString().substring((int)(s.get((int)c).get("sub").toString().length() - 2), (int)(s.get((int)c).get("sub").toString().length()))) * 1.5d) + a;
					} else {
						a = (Double.parseDouble(s.get((int)c).get("sub").toString().substring((int)(s.get((int)c).get("sub").toString().length() - 1), (int)(s.get((int)c).get("sub").toString().length()))) * 1.5d) + a;
					}
					b = 1.5d + b;
					if (u.getString(String.valueOf((long)(c + 1000)), "").equals("1")) {
						if (s.get((int)c).get("sub").toString().endsWith("10")) {
							a = (Double.parseDouble(s.get((int)c).get("sub").toString().substring((int)(s.get((int)c).get("sub").toString().length() - 2), (int)(s.get((int)c).get("sub").toString().length()))) * 0.5d) + a;
						} else {
							a = (Double.parseDouble(s.get((int)c).get("sub").toString().substring((int)(s.get((int)c).get("sub").toString().length() - 1), (int)(s.get((int)c).get("sub").toString().length()))) * 0.5d) + a;
						}
						b = 0.5d + b;
					}
					c++;
				}
				c = Math.round(1000 * (a / b));
				textview3.setText("Ο μέσος όρος με συντελεστές\nείναι ".concat(String.valueOf(c / 1000)));
				textview3.setEnabled(false);
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								textview3.setText("Μαθηματικό Ε.Κ.Π.Α. Μ.Ο.");
								textview3.setEnabled(true);
							}
						});
					}
				};
				_timer.schedule(t, (int)(2000));
			}
		});
	}
	
	private void initializeLogic() {
		if (!u.getString("rep", "").equals("")) {
			c = 0;
			for(int _repeat30 = 0; _repeat30 < (int)(Double.parseDouble(u.getString("rep", ""))); _repeat30++) {
				{
					HashMap<String, Object> _item = new HashMap<>();
					_item.put("sub", u.getString(String.valueOf((long)(c)), ""));
					s.add(_item);
				}
				c++;
			}
		}
		listview1.setAdapter(new Listview1Adapter(s));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		if (u.getString("t", "").equals("1")) {
			button1.setTextColor(0xFF0288D1);
			button2.setTextColor(0xFF0288D1);
			button1.setBackgroundResource(R.drawable.break_light);
			button2.setBackgroundResource(R.drawable.break_light);
			linear1.setBackgroundColor(0xFFFFF3E0);
			linear4.setBackgroundColor(0xFFFFF3E0);
			textview3.setBackgroundResource(R.drawable.main_light);
			textview3.setTextColor(0xFFF57C00);
		}
		if (s.size() > 0) {
			button2.setEnabled(true);
		} else {
			button2.setEnabled(false);
		}
		button2.setText("Υπολογισμός Μέσου Όρου (".concat(String.valueOf((long)(s.size())).concat(")")));
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (!u.getString("add1", "").equals("") && u.getString("add2", "").equals("")) {
			if (u.getString("del45", "").equals("1")) {
				SketchwareUtil.showMessage(getApplicationContext(), "Το μάθημα διαγράφτηκε");
				u.edit().remove("del45").commit();
				u.edit().remove("add1").commit();
			} else {
				i.setClass(getApplicationContext(), ComActivity.class);
				startActivity(i);
			}
		} else {
			if (!u.getString("add2", "").equals("")) {
				if (u.getString("del45", "").equals("1")) {
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("sub", u.getString("add1", "").concat(u.getString("add2", "")));
						s.add((int)Double.parseDouble(u.getString("pos45", "")), _item);
					}
				} else {
					c = 0;
					for(int _repeat52 = 0; _repeat52 < (int)(s.size()); _repeat52++) {
						if (s.get((int)c).get("sub").toString().contains(u.getString("add1", ""))) {
							s.remove((int)(c));
							SketchwareUtil.showMessage(getApplicationContext(), "Ο βαθμός τροποποιήθηκε");
						}
						c++;
					}
					{
						HashMap<String, Object> _item = new HashMap<>();
						_item.put("sub", u.getString("add1", "").concat(u.getString("add2", "")));
						s.add(_item);
					}
				}
				listview1.setAdapter(new Listview1Adapter(s));
				((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
				u.edit().remove("add1").commit();
				u.edit().remove("add2").commit();
				c = 0;
				for(int _repeat69 = 0; _repeat69 < (int)(s.size()); _repeat69++) {
					u.edit().putString(String.valueOf((long)(c)), s.get((int)c).get("sub").toString()).commit();
					c++;
				}
				u.edit().putString("rep", String.valueOf((long)(c))).commit();
			}
			u.edit().remove("del45").commit();
			u.edit().remove("pos45").commit();
		}
		if (s.size() > 0) {
			button2.setEnabled(true);
		} else {
			button2.setEnabled(false);
		}
		button2.setText("Υπολογισμός Μέσου Όρου (".concat(String.valueOf((long)(s.size())).concat(")")));
		if (u.getString("t", "").equals("1")) {
			button2.setTextColor(0xFFF57C00);
			t = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							button2.setTextColor(0xFF0288D1);
						}
					});
				}
			};
			_timer.schedule(t, (int)(750));
		} else {
			button2.setTextColor(0xFFFF9800);
			t = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							button2.setTextColor(0xFF00BCD4);
						}
					});
				}
			};
			_timer.schedule(t, (int)(750));
		}
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
				_view = _inflater.inflate(R.layout.add, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final TextView textview2 = _view.findViewById(R.id.textview2);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final TextView textview3 = _view.findViewById(R.id.textview3);
			
			if (s.get((int)_position).get("sub").toString().endsWith("10")) {
				textview2.setText(s.get((int)_position).get("sub").toString().substring((int)(s.get((int)_position).get("sub").toString().length() - 2), (int)(s.get((int)_position).get("sub").toString().length())));
				textview3.setText(s.get((int)_position).get("sub").toString().substring((int)(0), (int)(s.get((int)_position).get("sub").toString().length() - 2)));
			} else {
				textview2.setText(s.get((int)_position).get("sub").toString().substring((int)(s.get((int)_position).get("sub").toString().length() - 1), (int)(s.get((int)_position).get("sub").toString().length())));
				textview3.setText(s.get((int)_position).get("sub").toString().substring((int)(0), (int)(s.get((int)_position).get("sub").toString().length() - 1)));
			}
			if ((textview3.getText().toString().equals("Απειροστικός Λογισμός 1") || (textview3.getText().toString().equals("Απειροστικός Λογισμός 2") || textview3.getText().toString().equals("Απειροστικός Λογισμός 3"))) || ((textview3.getText().toString().equals("Γραμμική Άλγεβρα 1") || textview3.getText().toString().equals("Γραμμική Άλγεβρα 2")) || (textview3.getText().toString().equals("Γεωμετρία 1") || (textview3.getText().toString().equals("Γεωμετρία 2") || (textview3.getText().toString().equals("Πληροφορική 1") || (textview3.getText().toString().equals("Πραγματική Ανάλυση") || (textview3.getText().toString().equals("Μιγαδική Ανάλυση 1") || (textview3.getText().toString().equals("Αριθμητική Ανάλυση") || (textview3.getText().toString().equals("Μαθηματική Στατιστική") || (textview3.getText().toString().equals("Πιθανότητες 1") || (textview3.getText().toString().equals("Βασική Άλγεβρα") || textview3.getText().toString().equals("Συνήθεις Διαφορικές Εξισώσεις")))))))))))) {
				if (u.getString("t", "").equals("1")) {
					linear1.setBackgroundResource(R.drawable.bg_light);
					textview3.setTextColor(0xFF69573B);
				} else {
					linear1.setBackgroundResource(R.drawable.bg_dark);
					textview3.setTextColor(0xFFFF9800);
				}
				u.edit().putString(String.valueOf((long)(_position + 1000)), "1").commit();
			} else {
				if (u.getString("t", "").equals("1")) {
					linear1.setBackgroundResource(R.drawable.bg_light2);
					textview3.setTextColor(0xFF69573B);
				} else {
					linear1.setBackgroundResource(R.drawable.bg_dark2);
					textview3.setTextColor(0xFFFF9800);
				}
				u.edit().putString(String.valueOf((long)(_position + 1000)), "0").commit();
			}
			if (Double.parseDouble(textview2.getText().toString()) > 8) {
				if (u.getString("t", "").equals("1")) {
					textview2.setTextColor(0xFF0288D1);
				} else {
					textview2.setTextColor(0xFF00B8D4);
				}
			} else {
				if (Double.parseDouble(textview2.getText().toString()) < 7) {
					if (u.getString("t", "").equals("1")) {
						textview2.setTextColor(0xFFFF6F00);
					} else {
						textview2.setTextColor(0xFFEEFF41);
					}
				} else {
					if (u.getString("t", "").equals("1")) {
						textview2.setTextColor(0xFF9C27B0);
					} else {
						textview2.setTextColor(0xFFD500F9);
					}
				}
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