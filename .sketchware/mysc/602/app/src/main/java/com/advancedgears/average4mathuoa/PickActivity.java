package com.advancedgears.average4mathuoa;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
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
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
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

public class PickActivity extends AppCompatActivity {
	
	private ArrayList<HashMap<String, Object>> j = new ArrayList<>();
	
	private LinearLayout linear1;
	private ListView listview1;
	
	private Intent i = new Intent();
	private SharedPreferences u;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.pick);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		listview1 = findViewById(R.id.listview1);
		u = getSharedPreferences("u", Activity.MODE_PRIVATE);
		
		listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				u.edit().putString("add1", j.get((int)_position).get("sub").toString()).commit();
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Απειροστικός Λογισμός 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γραμμική Άλγεβρα 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γεωμετρία 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Πληροφορική 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Απειροστικός Λογισμός 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γραμμική Άλγεβρα 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Πιθανότητες 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Απειροστικός Λογισμός 3");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Συνήθεις Διαφορικές Εξισώσεις");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αριθμητική Ανάλυση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Πραγματική Ανάλυση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Βασική Άλγεβρα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μαθηματική Στατιστική");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γεωμετρία 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μιγαδική Ανάλυση 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεμέλια Μαθηματικής Ανάλυσης");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεμέλια Άλγεβρας και Γεωμετρίας");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Συνδυαστική");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Διακριτά Μαθηματικά");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Γραφημάτων");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μερικές Διαφορικές Εξισώσεις 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Δακτύλιοι και Πρότυπα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Προβολική Γεωμετρία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Υπολογιστική Άλγεβρα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Μέτρου");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μαθηματική Λογική");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Κυρτή Ανάλυση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Εισαγωγή στο Σχεδιασμό και Ανάλυση Αλγορίθμων");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Αριθμών");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Εισαγωγή στη Θεμελίωση της Γεωμετρίας");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μεταθετική Άλγεβρα και Εφαρμογές");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μαθηματική Κρυπτογραφία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Εισαγωγή στη Συναρτησιακή Ανάλυση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αρμονική Ανάλυση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Συνόλων");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αναδρομικές Συναρτήσεις");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γεωμετρική Ανάλυση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Προσέγγισης");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Υπολογιστική Πολυπλοκότητα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Πεπερασμένα Σώματα και Κωδικοποίηση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μέθοδοι Εφαρμοσμένων Μαθηματικών");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θέματα Μαθηματικής Ανάλυσης 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γραμμικοί Τελεστές");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μερικές Διαφορικές Εξισώσεις 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Τοπολογία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μαθηματική Βιολογία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Κατανομών");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Εισαγωγή στη Διαφορική Γεωμετρία των Πολλαπλοτήτων");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θέματα Άλγεβρας και Γεωμετρίας 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αλγεβρική Συνδυαστική");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Εισαγωγή στην Αλγεβρική Θεωρία Αριθμών");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Ομολογική Άλγεβρα και Κατηγορίες");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Συμμετρίες και Αναπαραστάσεις");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Δυναμικά Συστήματα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θέματα Μαθηματικής Ανάλυσης 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μιγαδική Ανάλυση 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Ελέγχου");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αναλυτική Θεωρία Αριθμών");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Galois");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Διαφορικές Μορφές");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αλγεβρική Τοπολογία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θέματα Άλγεβρας και Γεωμετρίας 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Ομάδων");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Εισαγωγή στις Αλγεβρικές Καμπύλες");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Στοχαστικός Λογισμός");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μαθηματική Φυσική");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Πληροφορική 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Επιχειρησιακή Έρευνα: Μαθηματικός Προγραμματισμός");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Δομές Δεδομένων");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Λογισμός Πινάκων και Εφαρμογές");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Πιθανότητες 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γραφικά με Ηλεκτρονικούς Υπολογιστές");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Παιγνίων");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Βασική Πραγματική και Συναρτησιακή Ανάλυση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Υπολογιστική Επιστήμη και Τεχνολογία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Στοχαστικές Ανελίξεις");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αριθμητική Ανάλυση Διαφορικών Εξισώσεων");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γραμμικός και Μη Γραμμικός Προγραμματισμός");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αλγοριθμική Επιχειρησιακή Έρευνα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αριθμητική Γραμμική Άλγεβρα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αριθμητική Βελτιστοποίηση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Εφαρμοσμένη Ανάλυση Fourier");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Διδακτική Απειροστικού Λογισμού");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Διδακτική των Μαθηματικών 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Διδακτική των Μαθηματικών με την Αξιοποίηση Ψηφιακών Τεχνολογιών");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Διδακτική της Γεωμετρίας");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Διδακτική των Στοχαστικών Μαθηματικών");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Διδακτική των Μαθηματικών 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Πρακτική Άσκηση: Διδασκαλία των Μαθηματικών σε Σχολεία της Δευτεροβάθμιας Εκπαίδευσης");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Διδακτική της Άλγεβρας");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Η Διδασκαλία μέσω επίλυσης προβλήματος Μαθηματικοποίηση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αρχαία Ελληνικά Μαθηματικά Στοιχεία Ευκλείδη");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Ιστορία των Μαθηματικών Από την Αρχαιότητα έως την Αναγέννηση");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Φιλοσοφία Μαθηματικών");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Ιστορική Εξέλιξη του Απειροστικού Λογισμού");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Επιστημολογία και Διδακτική των Μαθηματικών");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Εισαγωγή στην Κοινωνιολογία της Εκπαίδευσης");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Ψυχολογία Μάθησης Γνωστική Ψυχολογία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρίες Μάθησης και Διδασκαλίας");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Ειδική Αγωγή");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Επιχειρησιακή Έρευνα: Στοχαστικά Μοντέλα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αναλογιστικά Μαθηματικά");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μπεϋζιανή Στατιστική");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γραμμικά Μοντέλα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Δυναμικός Προγραμματισμός");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Υπολογιστική Στατιστική");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θεωρία Αξιοπιστίας");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Ουρές Αναμονής");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Αρχές Γλωσσών Προγραμματισμού");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Υλοποίηση Συστημάτων Βάσεων Δεδομένων");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γραφικά 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Τεχνητή Νοημοσύνη");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μεταγλωττιστές");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Υπολογιστική Γεωμετρία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Σήματα και Συστήματα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Ψηφιακή Επεξεργασία Σήματος");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Λογιστική 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Εισαγωγή στην Πολιτική Οικονομία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μικροοικονομική Θεωρία 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μακροοικονομική Θεωρία 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μικροοικονομική Θεωρία 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μακροοικονομική Θεωρία 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Οικονομετρία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Φυσική Μετεωρολογία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Ηλεκτρομαγνητισμός");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Θερμότητα και Κύματα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Ειδική Θεωρία της Σχετικότητας");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Κβαντική Μηχανική 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Κβαντική Μηχανική 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μηχανική 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μηχανική 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Μη­ Γραμμικά Δυναμικά Συστήματα");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Κλασική Μηχανική");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γενική Αστρονομία 1");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γενική Αστρονομία 2");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Δυναμική Συνοπτική Μετεωρολογία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Γενική Θεωρία της Σχετικότητας και Κοσμολογία");
			j.add(_item);
		}
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("sub", "Κβαντική Φυσική");
			j.add(_item);
		}
		SketchwareUtil.sortListMap(j, "sub", false, true);
		listview1.setAdapter(new Listview1Adapter(j));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		if (u.getString("t", "").equals("1")) {
			linear1.setBackgroundColor(0xFFFFF3E0);
		} else {
			linear1.setBackgroundColor(0xFF000000);
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
				_view = _inflater.inflate(R.layout.picker, null);
			}
			
			final TextView textview1 = _view.findViewById(R.id.textview1);
			
			textview1.setText(j.get((int)_position).get("sub").toString());
			if (u.getString("t", "").equals("1")) {
				textview1.setTextColor(0xFFFF6F00);
				if ((textview1.getText().toString().equals("Απειροστικός Λογισμός 1") || (textview1.getText().toString().equals("Απειροστικός Λογισμός 2") || textview1.getText().toString().equals("Απειροστικός Λογισμός 3"))) || ((textview1.getText().toString().equals("Γραμμική Άλγεβρα 1") || textview1.getText().toString().equals("Γραμμική Άλγεβρα 2")) || (textview1.getText().toString().equals("Γεωμετρία 1") || (textview1.getText().toString().equals("Γεωμετρία 2") || (textview1.getText().toString().equals("Πληροφορική 1") || (textview1.getText().toString().equals("Πραγματική Ανάλυση") || (textview1.getText().toString().equals("Μιγαδική Ανάλυση 1") || (textview1.getText().toString().equals("Αριθμητική Ανάλυση") || (textview1.getText().toString().equals("Μαθηματική Στατιστική") || (textview1.getText().toString().equals("Πιθανότητες 1") || (textview1.getText().toString().equals("Βασική Άλγεβρα") || textview1.getText().toString().equals("Συνήθεις Διαφορικές Εξισώσεις")))))))))))) {
					textview1.setBackgroundResource(R.drawable.bg_light);
				} else {
					textview1.setBackgroundResource(R.drawable.bg_light2);
				}
			} else {
				textview1.setTextColor(0xFFEEFF41);
				if ((textview1.getText().toString().equals("Απειροστικός Λογισμός 1") || (textview1.getText().toString().equals("Απειροστικός Λογισμός 2") || textview1.getText().toString().equals("Απειροστικός Λογισμός 3"))) || ((textview1.getText().toString().equals("Γραμμική Άλγεβρα 1") || textview1.getText().toString().equals("Γραμμική Άλγεβρα 2")) || (textview1.getText().toString().equals("Γεωμετρία 1") || (textview1.getText().toString().equals("Γεωμετρία 2") || (textview1.getText().toString().equals("Πληροφορική 1") || (textview1.getText().toString().equals("Πραγματική Ανάλυση") || (textview1.getText().toString().equals("Μιγαδική Ανάλυση 1") || (textview1.getText().toString().equals("Αριθμητική Ανάλυση") || (textview1.getText().toString().equals("Μαθηματική Στατιστική") || (textview1.getText().toString().equals("Πιθανότητες 1") || (textview1.getText().toString().equals("Βασική Άλγεβρα") || textview1.getText().toString().equals("Συνήθεις Διαφορικές Εξισώσεις")))))))))))) {
					textview1.setBackgroundResource(R.drawable.bg_dark);
				} else {
					textview1.setBackgroundResource(R.drawable.bg_dark2);
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