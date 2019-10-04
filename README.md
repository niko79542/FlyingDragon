# FlyingDragon

* Toy Apps
  - [Articles with a scrollbar](https://lh3.googleusercontent.com/-9v5kYyPjA9E/XZTOzw-KFrI/AAAAAAAAINw/0L-_S1ghGF0I70FBV_JqIBSNJL6koojJwCK8BGAsYHg/s0/2019-10-02.png) - [Link](https://codelabs.developers.google.com/codelabs/kotlin-android-training-linear-layout/index.html?index=..%2F..android-kotlin-fundamentals#1)
  - [Click Counter](https://lh3.googleusercontent.com/-L5lU3tmGTYM/XZTPDyOFpkI/AAAAAAAAIN4/CerE5A-5STwxFcrTXSbUFBzpGHU_qOgrQCK8BGAsYHg/s0/2019-10-02.png) - [Link](https://codelabs.developers.google.com/codelabs/android-training-layout-editor-part-a/index.html?index=..%2F..android-training#1)
  - [Dice Roller](https://lh3.googleusercontent.com/-BBTL_IfKlIM/XZUk7n17OlI/AAAAAAAAIOk/atPN8UOE6GcltWefdEpYO1_G4IHR2Zo4wCK8BGAsYHg/s0/2019-10-02.png) - [Link](https://codelabs.developers.google.com/codelabs/kotlin-android-training-images-compat/index.html?index=..%2F..android-kotlin-fundamentals#1)
  - [Color Picker](https://lh3.googleusercontent.com/-3135Ax2NMGk/XZUk8JzwllI/AAAAAAAAIOo/m2SMsxP0jbESLSy_ynl5z8ynnD0sJtUeQCK8BGAsYHg/s0/2019-10-02.png) - [Link](https://codelabs.developers.google.com/codelabs/kotlin-android-training-constraint-layout/index.html?index=..%2F..android-kotlin-fundamentals#1)
  - [Trivia Game!](https://lh3.googleusercontent.com/-WDNXGUrTlxs/XZY96b_h5EI/AAAAAAAAIPY/OdgKQF0G42ksqjq-7Zi4SneJQ81lTUuTACK8BGAsYHg/s0/2019-10-03.png) - [code Link](AndroidTrivia-Starter)

* Resources 
  - [Sample Apps](https://github.com/googlesamples)

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
   
 * Fragments, Binding 
   - Navigation library to build a navigation graph from 1 fra  
   
 * Sharing on Fb/hangouts/copy [link](https://codelabs.developers.google.com/codelabs/kotlin-android-training-start-external-activity/index.html?index=..%2F..android-kotlin-fundamentals#4)  use an implicit Intent, use startActivity() and resolveActivity() with intent.
 
 * Logging and Lifecycle
  - Activities and Fragments share similar lifecycle methods, but not exactly.
  - Activity has onCreate called once.  Then onStart is called whenever that activity switches into View.
  - Log.i logs an informational messsage.  First arg, (e.g. MainActivity) creates log message with I/MainActivity.
  - Activities or Fragments can be LifecycleOwners [LifecycleOwner interface](https://developer.android.com/reference/android/arch/lifecycle/LifecycleOwner).  The LifecycleOwner, owns an instance of the Lifecycle class [Lifecycle](https://developer.android.com/reference/android/arch/lifecycle/Lifecycle.html).  Annotate code to run on (a)  [Lifecycle.Event](https://developer.android.com/reference/android/arch/lifecycle/Lifecycle.Event.html)
  - LifecycleOwners implement the [LifecycleObserver interface](https://developer.android.com/reference/android/arch/lifecycle/LifecycleObserver)
   
 * Questions/Comments 
   - Storing View references as lateinit, initializing in onCreate
   - Speeding up builds? [Link](https://buck.build/)
   - [Gradle remove build cache misses?](https://www.youtube.com/watch?v=2frfDMJwvf4&feature=youtu.be&t=384)
   - Local build cache vs remote build cache 
   
   
  * Bugs
   - View.findNavigationController() cannot find navHost.  
   - Solution: Upgrade Gradle to v3.5?  The navHost fragment MUST have name android:name="androidx.navigation.fragment.NavHostFragment" and the app:startDestination in the navigation graph MUST match the ID.  (Same with the initial navHost fragment.  Can also try upgrading gradle to v3.5.  Navigation is a newer library, use the latest version probably v2.1.0 as of 10.3.2019. [Codelabs navigation tutorial](https://codelabs.developers.google.com/codelabs/kotlin-android-training-add-navigation/index.html?index=..%2F..android-kotlin-fundamentals#3)  
   
  - Use latest Gradle (10.3.2019) Android Gradle Plugin    3.5.0 Requires Gradle 5.4.1+
  
  

