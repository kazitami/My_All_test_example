package Day21_Wrapper_Class;

public class Topic4_Boxing_Unboxing_Autoboxing_Autounboxing {

	//The parent of the below classes is Number Class
		// - Integer
		// - Long
		// - Double
		// - Float
		// - Byte
	
	//The parent class of the below mentioned classes is Object class	
		// - Character
		// - Boolean
	
	//What is boxing?
	//Conversion of primitive data into Wrapper Class Object
	
	
	//What is Unboxing?
	//Conversion of Wrapper Class object into primitive data type
	
	//Homework - try boxing, unboxing, autoboxing and autounboxing for the Wrapper Class Objects and data types
	
	
	
	//----------------------------------------------------------------
	public static void main(String[] args) {
		
		System.out.println("---------------------Integer-------------------");
		//---Integer Wrapper Class------
			boxingIntegerExample();
			autoboxingIntegerExample();
			UnboxingIntegerExample();
			AutoUnboxingIntegerExample();
		//------------------------------
			System.out.println();
			System.out.println("---------------------Long-------------------");
		//---Long Wrapper Class------
			boxingLongExample();
			autoboxingLongExample();
			UnboxingLongExample();
			AutoUnboxingLongExample();
		//------------------------------
			System.out.println();
			System.out.println("---------------------Double-------------------");
		//---Double Wrapper Class------
			boxingDoubleExample();
			autoboxingDoubleExample();
			UnboxingDoubleExample();
			AutoUnboxingDoubleExample();
		//------------------------------
			System.out.println();
			System.out.println("---------------------Float-------------------");	
		//---Float Wrapper Class------
			boxingFloatExample();
			autoboxingFloatExample();
			UnboxingFloatExample();
			AutoUnboxingFloatExample();
		//------------------------------	
			System.out.println();
			System.out.println("---------------------Byte-------------------");
		//---Byte Wrapper Class------
			boxingByteExample();
			autoboxingByteExample();
			UnboxingByteExample();
			AutoUnboxingByteExample();
		//------------------------------
			System.out.println();
			System.out.println("---------------------Character-------------------");	
		//---Character Wrapper Class------
			boxingCharacterExample();
			autoboxingCharacterExample();
			UnboxingCharacterExample();
			AutoUnboxingCharacterExample();
		//------------------------------
			System.out.println();
			System.out.println("---------------------Boolean-------------------");	
		//---Boolean Wrapper Class------
			boxingBooleanExample();
			autoboxingBooleanExample();
			UnboxingBooleanExample();
			AutoUnboxingBooleanExample();
		//------------------------------
	}
	
	
	//------------------------Integer------------------------------
	public static void boxingIntegerExample() {//Integer
		int primitiveDataType_a =100;
		Integer WrapperClassObject_b = Integer.valueOf(primitiveDataType_a);
		System.out.println("boxing - The wrapper class object by using method valueOf():" +WrapperClassObject_b);
	}
	
	public static void autoboxingIntegerExample() {//Integer
		int primitiveDataType_a =100;
		Integer WrapperClassObject_b = primitiveDataType_a;
		System.out.println("autoboxing-converting Primitive data type to Wrapper Class Integer Object :" + WrapperClassObject_b);
	}
	
	public static void UnboxingIntegerExample() {//Integer
		Integer  WrapperClassObject_b =100;
		int primitiveDataType_a = WrapperClassObject_b.intValue();
		System.out.println("Unboxing - converting Wrapper Class Object to Primitive Data type by using method intValue():" + primitiveDataType_a);
	}
	
	public static void AutoUnboxingIntegerExample() {//Integer
		Integer  WrapperClassObject_b =100;
		int primitiveDataType_a = WrapperClassObject_b; //you don't need .intValue here
		System.out.println("AutoUnboxing - converting Wrapper Class Object to Primitive Data Type :" + primitiveDataType_a);
	}
	
	
	//------------------------Long------------------------------
	public static void boxingLongExample() {//Long 
		long primitiveDataType_a =200;
		Long WrapperClassObject_b = Long.valueOf(primitiveDataType_a);
		System.out.println("boxing - Converting primitive data type to The wrapper class object using method" + WrapperClassObject_b);
	}
	
	public static void autoboxingLongExample() {//Long
		Long WrapperClassObject_b = (long) 4563456;
		long primitiveDataType_a = WrapperClassObject_b;
		System.out.println("Autoboxing - Converting primitive data type to The wrapper class object" + primitiveDataType_a);
	}
	
	public static void UnboxingLongExample() {//Long
		Long WrapperClassObject_b= (long) 4563456;
		long primitiveDataType_a = Long.valueOf(WrapperClassObject_b);
		System.out.println("Autoboxing - Converting The wrapper class object to primitive data type" + primitiveDataType_a);
		
	}
	
	public static void AutoUnboxingLongExample() {//Long
		Long WrapperClassObject_b= (long) 4563456;
		long primitiveDataType_a = WrapperClassObject_b;
		System.out.println("Autoboxing - Converting The wrapper class object to primitive data type" + primitiveDataType_a);
		
	}
	
	//-----------------------Double------------------------------------
	
		public static void boxingDoubleExample() {//Double
			double primitiveDataType_a =100.34;
			Double WrapperClassObject_b = Double.valueOf(primitiveDataType_a);
			System.out.println("boxing - The wrapper class object by using method valueOf():" +WrapperClassObject_b);
		}
		
		public static void autoboxingDoubleExample() {//Double
			double primitiveDataType_a =100.45;
			Double WrapperClassObject_b = primitiveDataType_a;
			System.out.println("autoboxing-converting Primitive data type to Wrapper Class Integer Object :" + WrapperClassObject_b);
		}
		
		public static void UnboxingDoubleExample() {//Double
			Double  WrapperClassObject_b = 100.45;
			double primitiveDataType_a = WrapperClassObject_b.doubleValue();
			System.out.println("Unboxing - converting Wrapper Class Object to Primitive Data type by using method intValue():" + primitiveDataType_a);
		}
		
		public static void AutoUnboxingDoubleExample() {//Double
			Double  WrapperClassObject_b =100.45;
			double primitiveDataType_a = WrapperClassObject_b; //you don't need .intValue here
			System.out.println("AutoUnboxing - converting Wrapper Class Object to Primitive Data Type :" + primitiveDataType_a);
		}
		//-------------------------------------------------------------------
		
		
		//------------------------Float------------------------------
		
			public static void boxingFloatExample() {//Float
				float primitiveDataType_a =(float) 100.34;
				Float WrapperClassObject_b = Float.valueOf(primitiveDataType_a);
				System.out.println("boxing - The wrapper class object by using method valueOf():" +WrapperClassObject_b);
			}
			
			public static void autoboxingFloatExample() {//Float
				float primitiveDataType_a =(float) 100.45;
				Float WrapperClassObject_b = primitiveDataType_a;
				System.out.println("autoboxing-converting Primitive data type to Wrapper Class Integer Object :" + WrapperClassObject_b);
			}
			
			public static void UnboxingFloatExample() {//Float
				Float  WrapperClassObject_b = (float) 100.45;
				float primitiveDataType_a = WrapperClassObject_b.floatValue();
				System.out.println("Unboxing - converting Wrapper Class Object to Primitive Data type by using method intValue():" + primitiveDataType_a);
			}
			
			public static void AutoUnboxingFloatExample() {//Float
				Float  WrapperClassObject_b =(float) 100.45;
				float primitiveDataType_a = WrapperClassObject_b; //you don't need .intValue here
				System.out.println("AutoUnboxing - converting Wrapper Class Object to Primitive Data Type :" + primitiveDataType_a);
			}
			//-------------------------------------------------------------------
			
			//------------------------Byte------------------------------
			
			public static void boxingByteExample() {//Byte
				byte primitiveDataType_a = 23;
				Byte WrapperClassObject_b = Byte.valueOf(primitiveDataType_a);
				System.out.println("Byte boxing - The wrapper class object by using method valueOf():" +WrapperClassObject_b);
			}
			
			public static void autoboxingByteExample() {//Byte
				byte primitiveDataType_a = 10;
				Byte WrapperClassObject_b = primitiveDataType_a;
				System.out.println("Byte autoboxing-converting Primitive data type to Wrapper Class Integer Object :" + WrapperClassObject_b);
			}
			
			public static void UnboxingByteExample() {//Byte
				Byte  WrapperClassObject_b = 10;
				byte primitiveDataType_a = WrapperClassObject_b.byteValue();
				System.out.println(" Byte Unboxing - converting Wrapper Class Object to Primitive Data type by using method intValue():" + primitiveDataType_a);
			}
			
			public static void AutoUnboxingByteExample() {//Byte
				Byte  WrapperClassObject_b =10;
				byte primitiveDataType_a = WrapperClassObject_b; //you don't need .intValue here
				System.out.println("Byte AutoUnboxing - converting Wrapper Class Object to Primitive Data Type :" + primitiveDataType_a);
			}
			//-------------------------------------------------------------------
			
//------------------------Character------------------------------
			
			public static void boxingCharacterExample() {//Character
				char primitiveDataType_a = 'M';
				Character WrapperClassObject_b = Character.valueOf(primitiveDataType_a);
				System.out.println("Byte boxing - The wrapper class object by using method valueOf():" +WrapperClassObject_b);
			}
			
			public static void autoboxingCharacterExample() {//Character
				char primitiveDataType_a = 'N';
				Character WrapperClassObject_b = primitiveDataType_a;
				System.out.println("Byte autoboxing-converting Primitive data type to Wrapper Class Integer Object :" + WrapperClassObject_b);
			}
			
			public static void UnboxingCharacterExample() {//Character
				Character  WrapperClassObject_b = 'O';
				char primitiveDataType_a = WrapperClassObject_b.charValue();
				System.out.println(" Byte Unboxing - converting Wrapper Class Object to Primitive Data type by using method intValue():" + primitiveDataType_a);
			}
			
			public static void AutoUnboxingCharacterExample() {//Character
				Character WrapperClassObject_b = 'P';
				char primitiveDataType_a = WrapperClassObject_b; //you don't need .intValue here
				System.out.println("Byte AutoUnboxing - converting Wrapper Class Object to Primitive Data Type :" + primitiveDataType_a);
			}
			//-------------------------------------------------------------------
			
//------------------------Boolean------------------------------
			
			public static void boxingBooleanExample() {//Byte
				boolean primitiveDataType_a = false;
				Boolean WrapperClassObject_b = Boolean.valueOf(primitiveDataType_a);
				
				if(WrapperClassObject_b==true) {
				System.out.println("Boolean boxing - The wrapper class object by using method valueOf():" +WrapperClassObject_b);
				}else
				{
					System.out.println("Boolean boxing False");
				}
				}
			
			public static void autoboxingBooleanExample() {//Byte
				boolean primitiveDataType_a = true;
				Boolean WrapperClassObject_b = primitiveDataType_a;
				if(WrapperClassObject_b==true) {
				System.out.println("Boolean autoboxing-converting Primitive data type to Wrapper Class Integer Object :" + WrapperClassObject_b);
				}else
				{
					System.out.println("Boolean autoboxing False");
				}
			}
			
			public static void UnboxingBooleanExample() {//Byte
				Boolean  WrapperClassObject_b = false;
				boolean primitiveDataType_a = WrapperClassObject_b.booleanValue();
				if(primitiveDataType_a==true) {
				System.out.println(" Boolean Unboxing - converting Wrapper Class Object to Primitive Data type by using method intValue():" + primitiveDataType_a);
				}else
				{
					System.out.println("Boolean Unboxing False");
				}
			}
			
			public static void AutoUnboxingBooleanExample() {//Byte
				Boolean  WrapperClassObject_b =true;
				boolean primitiveDataType_a = WrapperClassObject_b; //you don't need .intValue here
				
				if(primitiveDataType_a==true) {
				System.out.println("Boolean AutoUnboxing - converting Wrapper Class Object to Primitive Data Type :" + primitiveDataType_a);
				}else
				{
					System.out.println("Boolean AutoUnboxing False");
				}
				
			}
			//-------------------------------------------------------------------
			
			
			
}
