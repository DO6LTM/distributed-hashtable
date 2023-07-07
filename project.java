// F:\Uni\VAuD\distributed-hashtable\project
import java.util.AbstractMap.SimpleEntry;
import simulator.NodeGenerator;
import simulator.Node;
import launcher.InternalLauncher;
import java.util.Map.Entry;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
class Startup implements NodeGenerator{
public static void main(String[] args){
InternalLauncher.launch(new Startup(),args[0], Integer.parseInt(args[1]), args[2].equals("on"), args[3].equals("on"), args[4].equals("on"), args[5], Integer.parseInt(args[6]), Integer.parseInt(args[7]));}
public String[] nodeTypes(){
return new String[]{"ListNode"};
}
public Node generateNode(String type, String name, boolean runSemisynchron){
if (type.equals("ListNode")) return new nodeTypeListNode(name, runSemisynchron);
return null;
}
}class nodeTypeListNode extends Node{
public nodeTypeListNode (String name, boolean runSemisynchron){super(name,"ListNode",runSemisynchron);}
List<Edge> v1 = new ArrayList<Edge>();
List<Edge> v2 = new ArrayList<Edge>();
double v3 = Double.NaN;
List<List<Integer>> v4 = new ArrayList<List<Integer>>();
List<List<Double>> v5 = new ArrayList<List<Double>>();
List<List<Edge>> v6 = new ArrayList<List<Edge>>();
int v7 = 64;
List<Edge> v8 = new ArrayList<Edge>();
List<Edge> v9 = new ArrayList<Edge>();
@SuppressWarnings("unchecked")
public Entry<String, Object>[] getAttributes(){
return new SimpleEntry[] {
new SimpleEntry<String, Object>("left",v1), 
new SimpleEntry<String, Object>("right",v2), 
new SimpleEntry<String, Object>("hash_value",v3), 
new SimpleEntry<String, Object>("r",v4), 
new SimpleEntry<String, Object>("range",v5), 
new SimpleEntry<String, Object>("n",v6), 
new SimpleEntry<String, Object>("R_LENGTH",v7), 
new SimpleEntry<String, Object>("succs",v8), 
new SimpleEntry<String, Object>("preds",v9)};}
@SuppressWarnings("unchecked")
public Entry<String, Entry<String, String>[]>[] getFunctions(){
List<Entry<String, Entry<String, String>[]>> attr = new LinkedList<Entry<String, Entry<String, String>[]>>();
attr.add(new SimpleEntry<String, Entry<String, String>[]>("init",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("floatToBitstringCache",new SimpleEntry[] {
new SimpleEntry<String, String>("F", "double"), 
new SimpleEntry<String, String>("L", "int"), 
new SimpleEntry<String, String>("A", "int [] 2"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("floatToBitstring",new SimpleEntry[] {
new SimpleEntry<String, String>("F", "double"), 
new SimpleEntry<String, String>("L", "int"), 
new SimpleEntry<String, String>("A", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("prefix",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("A", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("pred",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("B", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("add_to_pred",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("P", "int [] 1"), 
new SimpleEntry<String, String>("B", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("_add_to_pred",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("succ",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("B", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("add_to_succ",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("P", "int [] 1"), 
new SimpleEntry<String, String>("B", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("_add_to_succ",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("update_range",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("update_n",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("add_to_n_for_left",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("L", "double"), 
new SimpleEntry<String, String>("R", "double")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("add_to_n_for_right",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("L", "double"), 
new SimpleEntry<String, String>("R", "double")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("_add_to_n",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("g",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("entry",new SimpleEntry[] {
new SimpleEntry<String, String>("C", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("timeout",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("linearize",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node")}));
Entry<String, Entry<String, String>[]>[] result = new Entry[attr.size()];
attr.toArray(result);
return result;}
@SuppressWarnings("unchecked")
public Entry<String, Long>[] getFunctionCallCounter(){List<Entry<String, Long>> attr = new LinkedList<Entry<String, Long>>();
attr.add(new SimpleEntry<String, Long>("init",callCounterinit));
attr.add(new SimpleEntry<String, Long>("floatToBitstringCache",callCounterfloatToBitstringCache));
attr.add(new SimpleEntry<String, Long>("floatToBitstring",callCounterfloatToBitstring));
attr.add(new SimpleEntry<String, Long>("prefix",callCounterprefix));
attr.add(new SimpleEntry<String, Long>("pred",callCounterpred));
attr.add(new SimpleEntry<String, Long>("add_to_pred",callCounteradd_to_pred));
attr.add(new SimpleEntry<String, Long>("_add_to_pred",callCounter_add_to_pred));
attr.add(new SimpleEntry<String, Long>("succ",callCountersucc));
attr.add(new SimpleEntry<String, Long>("add_to_succ",callCounteradd_to_succ));
attr.add(new SimpleEntry<String, Long>("_add_to_succ",callCounter_add_to_succ));
attr.add(new SimpleEntry<String, Long>("update_range",callCounterupdate_range));
attr.add(new SimpleEntry<String, Long>("update_n",callCounterupdate_n));
attr.add(new SimpleEntry<String, Long>("add_to_n_for_left",callCounteradd_to_n_for_left));
attr.add(new SimpleEntry<String, Long>("add_to_n_for_right",callCounteradd_to_n_for_right));
attr.add(new SimpleEntry<String, Long>("_add_to_n",callCounter_add_to_n));
attr.add(new SimpleEntry<String, Long>("g",callCounterg));
attr.add(new SimpleEntry<String, Long>("entry",callCounterentry));
attr.add(new SimpleEntry<String, Long>("timeout",callCountertimeout));
attr.add(new SimpleEntry<String, Long>("linearize",callCounterlinearize));
Entry<String, Long>[] result = new Entry[attr.size()];
attr.toArray(result);
return result;}
protected void messageReceived(Object [] params){
if (params.length<1 || ! (params[0] instanceof String)) return;
if (params[0].equals("init")){
funinit();if ((boolean)params[1]){
print("init returned");
}
}
if (params[0].equals("floatToBitstringCache")){
funfloatToBitstringCache((double)params[2], (int)params[3], (List<List<Integer>>)params[4], (int)params[5]);if ((boolean)params[1]){
print("floatToBitstringCache returned");
}
}
if (params[0].equals("floatToBitstring")){
funfloatToBitstring((double)params[2], (int)params[3], (List<Integer>)params[4]);if ((boolean)params[1]){
print("floatToBitstring returned");
}
}
if (params[0].equals("prefix")){
funprefix((int)params[2], (simulator.Node)params[3], (List<Integer>)params[4]);if ((boolean)params[1]){
print("prefix returned");
}
}
if (params[0].equals("pred")){
funpred((int)params[2], (simulator.Node)params[3], (int)params[4]);if ((boolean)params[1]){
print("pred returned");
}
}
if (params[0].equals("add_to_pred")){
funadd_to_pred((simulator.Node)params[2], (List<Integer>)params[3], (int)params[4]);if ((boolean)params[1]){
print("add_to_pred returned");
}
}
if (params[0].equals("_add_to_pred")){
fun_add_to_pred((simulator.Node)params[2], (int)params[3]);if ((boolean)params[1]){
print("_add_to_pred returned");
}
}
if (params[0].equals("succ")){
funsucc((int)params[2], (simulator.Node)params[3], (int)params[4]);if ((boolean)params[1]){
print("succ returned");
}
}
if (params[0].equals("add_to_succ")){
funadd_to_succ((simulator.Node)params[2], (List<Integer>)params[3], (int)params[4]);if ((boolean)params[1]){
print("add_to_succ returned");
}
}
if (params[0].equals("_add_to_succ")){
fun_add_to_succ((simulator.Node)params[2], (int)params[3]);if ((boolean)params[1]){
print("_add_to_succ returned");
}
}
if (params[0].equals("update_range")){
funupdate_range((int)params[2]);if ((boolean)params[1]){
print("update_range returned");
}
}
if (params[0].equals("update_n")){
funupdate_n((int)params[2]);if ((boolean)params[1]){
print("update_n returned");
}
}
if (params[0].equals("add_to_n_for_left")){
funadd_to_n_for_left((int)params[2], (simulator.Node)params[3], (double)params[4], (double)params[5]);if ((boolean)params[1]){
print("add_to_n_for_left returned");
}
}
if (params[0].equals("add_to_n_for_right")){
funadd_to_n_for_right((int)params[2], (simulator.Node)params[3], (double)params[4], (double)params[5]);if ((boolean)params[1]){
print("add_to_n_for_right returned");
}
}
if (params[0].equals("_add_to_n")){
fun_add_to_n((int)params[2], (simulator.Node)params[3]);if ((boolean)params[1]){
print("_add_to_n returned");
}
}
if (params[0].equals("g")){
Object result = fung((int)params[2]);
if ((boolean)params[1]){
print("g returns " + result);
}
}
if (params[0].equals("entry")){
funentry((simulator.Node)params[2]);if ((boolean)params[1]){
print("entry returned");
}
}
if (params[0].equals("timeout")){
funtimeout();if ((boolean)params[1]){
print("timeout returned");
}
}
if (params[0].equals("linearize")){
funlinearize((simulator.Node)params[2]);if ((boolean)params[1]){
print("linearize returned");
}
}
}
long callCounterinit;
protected void funinit() { callCounterinit++; try {
v3=fung(id(this));
funfloatToBitstringCache(v3, v7, v4, id(this));}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCounterfloatToBitstringCache;
protected void funfloatToBitstringCache(double p10, int p11, List<List<Integer>> p12, int p13) { callCounterfloatToBitstringCache++; try {
double v14 = p10;
int v15 = 0;
double v16 = Double.NaN;
for(v15=0;(v15<p11);v15=v15+1){{
v16=(v14*2.0);
if((v16>=1)){{
setArrayIndex('=',p12,Arrays.asList(p13, v15),1,0,3);
v14=(v16-1.0);
}
} else {if((v16<1)){{
setArrayIndex('=',p12,Arrays.asList(p13, v15),0,0,3);
v14=v16;
}
}}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in floatToBitstringCache: "+e.getMessage()); } return ;} long callCounterfloatToBitstring;
protected void funfloatToBitstring(double p17, int p18, List<Integer> p19) { callCounterfloatToBitstring++; try {
clearArray(p19,false);
double v20 = p17;
int v21 = 0;
double v22 = Double.NaN;
for(v21=0;(v21<p18);v21=v21+1){{
v22=(v20*2.0);
if((v22>1)){{
addArrayEnd(p19,1);
v20=(v22-1.0);
}
} else {if((v22<1)){{
addArrayEnd(p19,0);
v20=v22;
}
}}}
}while((length(p19)<p18)){{
addArrayEnd(p19,0);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in floatToBitstring: "+e.getMessage()); } return ;} long callCounterprefix;
protected void funprefix(int p23, simulator.Node p24, List<Integer> p25) { callCounterprefix++; try {
List<Integer> v26 = new ArrayList<Integer>();
funfloatToBitstring(fung(id(p24)), v7, v26);clearArray(p25,false);
int v27 = 0;
for(v27=0;(v27<p23);v27=v27+1){{
addArrayEnd(p25,getArrayIndex(v26,0,v27));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in prefix: "+e.getMessage()); } return ;} long callCounterpred;
protected void funpred(int p28, simulator.Node p29, int p30) { callCounterpred++; try {
List<Integer> v31 = new ArrayList<Integer>();
funprefix(p28, p29, v31);addArrayEnd(v31,p30);
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_pred",false,this, v31, p30);}
}
}clearArray(v31,false);
}
 catch (ArithmeticException e){ print("arithmetic exception in pred: "+e.getMessage()); } return ;} long callCounteradd_to_pred;
protected void funadd_to_pred(simulator.Node p32, List<Integer> p33, int p34) { callCounteradd_to_pred++; try {
boolean v35 = this.FALSE;
int v36 = 0;
for(v36=0;(v36<length(p33));v36=v36+1){{
if((getArrayIndex(p33,0,v36)!=getArrayIndex(v4,0,id(this), v36))){{
v35=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((v35==this.FALSE)){{
{if (p32!=null) p32.send("_add_to_pred",false,this, p34);}
}
} else {{
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_pred",false,p32, p33, p34);}
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_pred: "+e.getMessage()); } return ;} long callCounter_add_to_pred;
protected void fun_add_to_pred(simulator.Node p37, int p38) { callCounter_add_to_pred++; try {
updateVisualization(v9,p37,true,"black",1,p38);
}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_pred: "+e.getMessage()); } return ;} long callCountersucc;
protected void funsucc(int p39, simulator.Node p40, int p41) { callCountersucc++; try {
List<Integer> v42 = new ArrayList<Integer>();
funprefix(p39, p40, v42);addArrayEnd(v42,p41);
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_succ",false,this, v42, p41);}
}
}clearArray(v42,false);
}
 catch (ArithmeticException e){ print("arithmetic exception in succ: "+e.getMessage()); } return ;} long callCounteradd_to_succ;
protected void funadd_to_succ(simulator.Node p43, List<Integer> p44, int p45) { callCounteradd_to_succ++; try {
boolean v46 = this.FALSE;
int v47 = 0;
for(v47=0;(v47<length(p44));v47=v47+1){{
if((getArrayIndex(p44,0,v47)!=getArrayIndex(v4,0,id(this), v47))){{
v46=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((v46==this.FALSE)){{
{if (p43!=null) p43.send("_add_to_succ",false,this, p45);}
}
} else {{
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_succ",false,p43, p44, p45);}
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_succ: "+e.getMessage()); } return ;} long callCounter_add_to_succ;
protected void fun_add_to_succ(simulator.Node p48, int p49) { callCounter_add_to_succ++; try {
updateVisualization(v8,p48,true,"black",1,p49);
}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_succ: "+e.getMessage()); } return ;} long callCounterupdate_range;
protected void funupdate_range(int p50) { callCounterupdate_range++; try {
setArrayIndex('=',v5,Arrays.asList(p50, 0),((double)0),Double.NaN,3);
setArrayIndex('=',v5,Arrays.asList(p50, 1),((double)1),Double.NaN,3);
funpred(p50, this, 0);funpred(p50, this, 1);funsucc(p50, this, 0);funsucc(p50, this, 1);if((fung(id((getArrayIndex(v9,null,0)!=null?((Edge)(getArrayIndex(v9,null,0))).node:null)))<fung(id((getArrayIndex(v9,null,1)!=null?((Edge)(getArrayIndex(v9,null,1))).node:null))))){{
setArrayIndex('=',v5,Arrays.asList(p50, 0),fung(id((getArrayIndex(v9,null,0)!=null?((Edge)(getArrayIndex(v9,null,0))).node:null))),Double.NaN,3);
}
} else {{
setArrayIndex('=',v5,Arrays.asList(p50, 1),fung(id((getArrayIndex(v9,null,1)!=null?((Edge)(getArrayIndex(v9,null,1))).node:null))),Double.NaN,3);
}
}if((fung(id((getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null)))>fung(id((getArrayIndex(v8,null,1)!=null?((Edge)(getArrayIndex(v8,null,1))).node:null))))){{
setArrayIndex('=',v5,Arrays.asList(p50, 0),fung(id((getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null))),Double.NaN,3);
}
} else {{
setArrayIndex('=',v5,Arrays.asList(p50, 1),fung(id((getArrayIndex(v8,null,1)!=null?((Edge)(getArrayIndex(v8,null,1))).node:null))),Double.NaN,3);
}
}funupdate_n(p50);}
 catch (ArithmeticException e){ print("arithmetic exception in update_range: "+e.getMessage()); } return ;} long callCounterupdate_n;
protected void funupdate_n(int p51) { callCounterupdate_n++; try {
double v52 = getArrayIndex(v5,Double.NaN,p51, 0);
double v53 = getArrayIndex(v5,Double.NaN,p51, 1);
funadd_to_n_for_left(p51, this, v52, v53);funadd_to_n_for_right(p51, this, v52, v53);}
 catch (ArithmeticException e){ print("arithmetic exception in update_n: "+e.getMessage()); } return ;} long callCounteradd_to_n_for_left;
protected void funadd_to_n_for_left(int p54, simulator.Node p55, double p56, double p57) { callCounteradd_to_n_for_left++; try {
if((p55!=this)){{
double v58 = fung(id(this));
if(((p56<=v58)&(v58<=p57))){{
{if (p55!=null) p55.send("_add_to_n",false,p54, this);}
}
}}
}if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_n_for_left",false,p54, p55, p56, p57);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_n_for_left: "+e.getMessage()); } return ;} long callCounteradd_to_n_for_right;
protected void funadd_to_n_for_right(int p59, simulator.Node p60, double p61, double p62) { callCounteradd_to_n_for_right++; try {
if((p60!=this)){{
double v63 = fung(id(this));
if(((p61<=v63)&(v63<=p62))){{
{if (p60!=null) p60.send("_add_to_n",false,p59, this);}
}
}}
}if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_n_for_right",false,p59, p60, p61, p62);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_n_for_right: "+e.getMessage()); } return ;} long callCounter_add_to_n;
protected void fun_add_to_n(int p64, simulator.Node p65) { callCounter_add_to_n++; try {
if((length((getArrayIndex(v6,null,p64)!=null?((Edge)(getArrayIndex(v6,null,p64))).node:null))<=0)){{
updateVisualization(v6,p65,true,"black",3,p64, 0);
}
} else {{
updateVisualization(v6,p65,true,"black",3,p64, length((getArrayIndex(v6,null,p64)!=null?((Edge)(getArrayIndex(v6,null,p64))).node:null)));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_n: "+e.getMessage()); } return ;} long callCounterg;
protected double fung(int p66) { callCounterg++; try {
double v67 = hash(p66);
v67=(v67/Integer.MAX_VALUE);
v67=((v67+1)/2);
{if(this.TRUE)return v67;}}
 catch (ArithmeticException e){ print("arithmetic exception in g: "+e.getMessage()); } return Double.NaN;} long callCounterentry;
protected void funentry(simulator.Node p68) { callCounterentry++; try {
funlinearize(p68);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
if((((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)&(fung(id((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)))<v3))){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("linearize",false,this);}
}
} else {{
{if (this!=null) this.send("linearize",false,(getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null));}
updateVisualization(v1,null,true,"black",1,0);
}
}if((((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)&(fung(id((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)))>v3))){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("linearize",false,this);}
}
} else {{
{if (this!=null) this.send("linearize",false,(getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null));}
updateVisualization(v2,null,true,"black",1,0);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p69) { callCounterlinearize++; try {
if((fung(id(p69))<v3)){{
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)==null)){{
updateVisualization(v1,p69,true,"black",1,0);
}
} else {{
if((fung(id((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)))<fung(id(p69)))){{
{if (p69!=null) p69.send("linearize",false,(getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null));}
updateVisualization(v1,p69,true,"black",1,0);
}
} else {{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("linearize",false,p69);}
}
}}
}}
} else {if((fung(id(p69))>v3)){{
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)==null)){{
updateVisualization(v2,p69,true,"black",1,0);
}
} else {{
if((fung(id((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)))>fung(id(p69)))){{
{if (p69!=null) p69.send("linearize",false,(getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null));}
updateVisualization(v2,p69,true,"black",1,0);
}
} else {{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("linearize",false,p69);}
}
}}
}}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} }
