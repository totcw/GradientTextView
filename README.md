使用步骤：

1.添加Jcenter仓库 Gradle依赖：

  compile 'com.betterda.gradenttextview:gradienttextview2:0.0.1'

2.在xml如下使用代替textview
  <com.betterda.gradienttextview.GradientTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!" />
3.在activity中调用setVertrial来设置横向渐变或者竖直渐变
  调用setmColorList(int[] mColorList)来设置渐变的颜色
  
    
 
