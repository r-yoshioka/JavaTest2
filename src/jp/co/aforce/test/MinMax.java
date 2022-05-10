package jp.co.aforce.test;

public class MinMax {


//		練習問題２
		public int getMaxValue(int a, int b, int c) {

			int Lmax = a;
			    if(b > Lmax) Lmax = b;
			    if(c > Lmax) Lmax = c;
			    return Lmax;
		}

        public int getMinValue(int a, int b, int c) {

			int Lmin = a;
			    if(b < Lmin) Lmin = b;
			    if(c < Lmin) Lmin = c;
			    return Lmin;
		}
}

