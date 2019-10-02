# FlyingDragon


* UI
  - static resources
  - ViewGroups (Linear, Relative, Constraint)
  - View (TextView, Button, EditText, ImageView, )
  - Acvitity + Intent
  - XML Attributes 
  - Constraints 
  - Tablet v Mobile 
  - Landscape v Portrait
  - view.Visibility = View.[GONE/VISIBLE]
  - Chain Views (Spread [default], Spread inside, Packed, Weighted
  - Style resources contain multiple items.
     ```html
     <style name="whiteBox">
     <item name="android:background">@android:color/holo_green_light</item>
     <item name="android:textAlignment">center</item>
     <item name="android:textSize">@dimen/box_text_size</item>
     <item name="android:textStyle">bold</item>
     <item name="android:textColor">@android:color/white</item>
     <item name="android:fontFamily">@font/roboto</item>
     </style> ```
 
 * Data-Binding
   - DataBindingUtil, ActivityMainBinding, layout, [link](https://codelabs.developers.google.com/codelabs/kotlin-android-training-data-binding-basics/index.html?index=..%2F..android-kotlin-fundamentals#2)
   - add onclick listeners to every view in a binding?
   - data class for injecting data into your app.
   
 * Questions/Comments 
   - Storing View references as lateinit, initializing in onCreate
   - Wow there are [a lot](https://developer.android.com/reference/android/view/View) of interactive methods available for the View class 
  
  
* Toy Apps
  - [Articles with a scrollbar](https://lh3.googleusercontent.com/-9v5kYyPjA9E/XZTOzw-KFrI/AAAAAAAAINw/0L-_S1ghGF0I70FBV_JqIBSNJL6koojJwCK8BGAsYHg/s0/2019-10-02.png)
  - [Click Counter](https://lh3.googleusercontent.com/-L5lU3tmGTYM/XZTPDyOFpkI/AAAAAAAAIN4/CerE5A-5STwxFcrTXSbUFBzpGHU_qOgrQCK8BGAsYHg/s0/2019-10-02.png)
  - [Dice Roller](https://lh3.googleusercontent.com/-BBTL_IfKlIM/XZUk7n17OlI/AAAAAAAAIOk/atPN8UOE6GcltWefdEpYO1_G4IHR2Zo4wCK8BGAsYHg/s0/2019-10-02.png)
  - [Color Picker](https://lh3.googleusercontent.com/-3135Ax2NMGk/XZUk8JzwllI/AAAAAAAAIOo/m2SMsxP0jbESLSy_ynl5z8ynnD0sJtUeQCK8BGAsYHg/s0/2019-10-02.png)

* Resources 
  - [Sample Apps](https://github.com/googlesamples)
