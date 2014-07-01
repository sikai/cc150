class ThreeStacksWithArr {
		public static class arrStack{
			int[] arr;
			int bot1;
			int top1;
			int bot2;
			int top2;
			int bot3;
			int top3;
			public arrStack(int s1, int s2, int s3){
				this.arr = new int[s1+s2+s3];
				this.bot1 = 0;
				this.top1 = s1-1;
				this.bot2 = s1;
				this.top2 = s1+s2-1;
				this.bot3 = s1+s2;
				this.top3 = s1+s2+s3-1;
			}
			public void push(int stack_num, int ele){
				if(stack_num==0){
					if(isFull(0)) return;
					arr[bot1]=ele;
					bot1++;
				}else if(stack_num==1){
					if(isFull(1)) return;
					arr[bot2]=ele;
					bot2++;
				}else if(stack_num==2){
					if(isFull(2)) return;
					arr[bot3]=ele;
					bot3++;
				}else return;			
			}
			public boolean isFull(int stack_num){
				if(stack_num==0){
					return(bot1==top1+1);
				}else if(stack_num==1){
					return(bot2==top2+1);
				}else if(stack_num==2){
					return(bot3==top3+1);
				}else return false;
			}
			public boolean isEmpty(int stack_num){
				if(stack_num==0){
					return(bot1==0);
				}else if(stack_num==1){
					return(bot2==top1+1);
				}else if(stack_num==2){
					return(bot3==top2+1);
				}else return false;
			}
			public int pop(int stack_num){
				if(stack_num==0){
					if(isEmpty(0)) return -1;
					bot1--;
					return arr[bot1];
				}else if(stack_num==1){
					if(isEmpty(1)) return -1;
					bot2--;
					return arr[bot2];
				}else if(stack_num==2){
					if(isEmpty(2)) return -1;
					bot3--;
					return arr[bot3];
				}else return -1;
			} 
		}

	public static void main(String[] args) {
		arrStack as = new arrStack(3,3,3);
		as.push(1,0);
		as.push(1,2);
		as.push(1,3);
		as.push(1,4);
		System.out.println(as.pop(1));
		as.push(0,0);
		as.push(0,1);
		as.push(0,2);
		as.push(0,3);
		as.push(0,99);
		System.out.println(as.pop(0));
		System.out.println(as.pop(0));
		System.out.println(as.pop(0));
		System.out.println(as.pop(0));
		as.push(2,11);
		as.push(2,12);
		as.push(2,13);
		as.push(2,14);
		as.push(2,99);
		System.out.println(as.pop(2));
		System.out.println(as.pop(2));
		System.out.println(as.pop(2));
		System.out.println(as.pop(2));
		as.push(2,99);
		as.push(2,14);
		as.push(2,13);
		as.push(2,12);
		System.out.println(as.pop(2));
		System.out.println(as.pop(2));
		System.out.println(as.pop(2));
		System.out.println(as.pop(2));
	}
}