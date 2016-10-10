# ListView and CardView
Create lists and cards with material design styles in your apps, you can use the ListView and CardView widgets.
## Screenshot
![alt text](api-19-24.png "API 19 and API 24")
## Step by step
1. Add the Gradle dependencies to your app's module.   
 ```
dependencies {
    ...
    compile 'com.android.support:cardview-v7:24.2.1'
}
```
2. In your activity layout, add a ListView with a transparent divider.   
 ```
<ListView
	...
	android:divider="@android:color/transparent" />
```
3. Add your CardView layout to the resources. Set the clipToPadding to false.   
 ```
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    ...
    android:clipToPadding="false">

    <android.support.v7.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <!-- Your item contents -->
    </android.support.v7.widget.CardView>
</LinearLayout>
```
4. In your activity class, setup your ListView and its adapter.   
 ```java
public class CardsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ...

        ListView lvCards = (ListView) findViewById(R.id.list_cards);
        CardsAdapter adapter = new CardsAdapter(this);

        lvCards.setAdapter(adapter);
    }
}
```
