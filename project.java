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
List<Integer> v7 = new ArrayList<Integer>();
int v8 = 64;
List<Edge> v9 = new ArrayList<Edge>();
List<Edge> v10 = new ArrayList<Edge>();
@SuppressWarnings("unchecked")
public Entry<String, Object>[] getAttributes(){
return new SimpleEntry[] {
new SimpleEntry<String, Object>("left",v1), 
new SimpleEntry<String, Object>("right",v2), 
new SimpleEntry<String, Object>("hash_value",v3), 
new SimpleEntry<String, Object>("r",v4), 
new SimpleEntry<String, Object>("range",v5), 
new SimpleEntry<String, Object>("n",v6), 
new SimpleEntry<String, Object>("n_length",v7), 
new SimpleEntry<String, Object>("R_LENGTH",v8), 
new SimpleEntry<String, Object>("succs",v9), 
new SimpleEntry<String, Object>("preds",v10)};}
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
new SimpleEntry<String, String>("B", "int"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("_add_to_pred",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("B", "int"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("succ",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("B", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("add_to_succ",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("P", "int [] 1"), 
new SimpleEntry<String, String>("B", "int"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("_add_to_succ",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("B", "int"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("update_range",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("set_range",new SimpleEntry[] {
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
attr.add(new SimpleEntry<String, Long>("set_range",callCounterset_range));
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
funadd_to_pred((simulator.Node)params[2], (List<Integer>)params[3], (int)params[4], (int)params[5]);if ((boolean)params[1]){
print("add_to_pred returned");
}
}
if (params[0].equals("_add_to_pred")){
fun_add_to_pred((simulator.Node)params[2], (int)params[3], (int)params[4]);if ((boolean)params[1]){
print("_add_to_pred returned");
}
}
if (params[0].equals("succ")){
funsucc((int)params[2], (simulator.Node)params[3], (int)params[4]);if ((boolean)params[1]){
print("succ returned");
}
}
if (params[0].equals("add_to_succ")){
funadd_to_succ((simulator.Node)params[2], (List<Integer>)params[3], (int)params[4], (int)params[5]);if ((boolean)params[1]){
print("add_to_succ returned");
}
}
if (params[0].equals("_add_to_succ")){
fun_add_to_succ((simulator.Node)params[2], (int)params[3], (int)params[4]);if ((boolean)params[1]){
print("_add_to_succ returned");
}
}
if (params[0].equals("update_range")){
funupdate_range((int)params[2]);if ((boolean)params[1]){
print("update_range returned");
}
}
if (params[0].equals("set_range")){
funset_range((int)params[2]);if ((boolean)params[1]){
print("set_range returned");
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
funfloatToBitstringCache(v3, v8, v4, id(this));}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCounterfloatToBitstringCache;
protected void funfloatToBitstringCache(double p11, int p12, List<List<Integer>> p13, int p14) { callCounterfloatToBitstringCache++; try {
double v15 = p11;
int v16 = 0;
double v17 = Double.NaN;
for(v16=0;(v16<p12);v16=v16+1){{
v17=(v15*2.0);
if((v17>=1)){{
setArrayIndex('=',p13,Arrays.asList(p14, v16),1,0,3);
v15=(v17-1.0);
}
} else {if((v17<1)){{
setArrayIndex('=',p13,Arrays.asList(p14, v16),0,0,3);
v15=v17;
}
}}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in floatToBitstringCache: "+e.getMessage()); } return ;} long callCounterfloatToBitstring;
protected void funfloatToBitstring(double p18, int p19, List<Integer> p20) { callCounterfloatToBitstring++; try {
clearArray(p20,false);
double v21 = p18;
int v22 = 0;
double v23 = Double.NaN;
for(v22=0;(v22<p19);v22=v22+1){{
v23=(v21*2.0);
if((v23>1)){{
addArrayEnd(p20,1);
v21=(v23-1.0);
}
} else {if((v23<1)){{
addArrayEnd(p20,0);
v21=v23;
}
}}}
}while((length(p20)<p19)){{
addArrayEnd(p20,0);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in floatToBitstring: "+e.getMessage()); } return ;} long callCounterprefix;
protected void funprefix(int p24, simulator.Node p25, List<Integer> p26) { callCounterprefix++; try {
List<Integer> v27 = new ArrayList<Integer>();
funfloatToBitstring(fung(id(p25)), v8, v27);clearArray(p26,false);
int v28 = 0;
for(v28=0;(v28<p24);v28=v28+1){{
addArrayEnd(p26,getArrayIndex(v27,0,v28));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in prefix: "+e.getMessage()); } return ;} long callCounterpred;
protected void funpred(int p29, simulator.Node p30, int p31) { callCounterpred++; try {
List<Integer> v32 = new ArrayList<Integer>();
funprefix(p29, p30, v32);addArrayEnd(v32,p31);
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_pred",false,this, v32, p31, p29);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in pred: "+e.getMessage()); } return ;} long callCounteradd_to_pred;
protected void funadd_to_pred(simulator.Node p33, List<Integer> p34, int p35, int p36) { callCounteradd_to_pred++; try {
boolean v37 = this.FALSE;
int v38 = 0;
for(v38=0;(v38<length(p34));v38=v38+1){{
if((getArrayIndex(p34,0,v38)!=getArrayIndex(v4,0,id(this), v38))){{
v37=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((v37==this.FALSE)){{
{if (p33!=null) p33.send("_add_to_pred",false,this, p35, p36);}
clearArray(p34,false);
}
} else {{
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_pred",false,p33, p34, p35, p36);}
}
} else {{
{if (p33!=null) p33.send("_add_to_pred",false,p33, p35, p36);}
clearArray(p34,false);
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_pred: "+e.getMessage()); } return ;} long callCounter_add_to_pred;
protected void fun_add_to_pred(simulator.Node p39, int p40, int p41) { callCounter_add_to_pred++; try {
updateVisualization(v10,p39,true,"black",1,p40);
if(((length((List<Node>)copyEdgeArrayToNodeArray(v10,1))==2)&(length((List<Node>)copyEdgeArrayToNodeArray(v9,1))==2))){{
funset_range(p41);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_pred: "+e.getMessage()); } return ;} long callCountersucc;
protected void funsucc(int p42, simulator.Node p43, int p44) { callCountersucc++; try {
List<Integer> v45 = new ArrayList<Integer>();
funprefix(p42, p43, v45);addArrayEnd(v45,p44);
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_succ",false,this, v45, p44, p42);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in succ: "+e.getMessage()); } return ;} long callCounteradd_to_succ;
protected void funadd_to_succ(simulator.Node p46, List<Integer> p47, int p48, int p49) { callCounteradd_to_succ++; try {
boolean v50 = this.FALSE;
int v51 = 0;
for(v51=0;(v51<length(p47));v51=v51+1){{
if((getArrayIndex(p47,0,v51)!=getArrayIndex(v4,0,id(this), v51))){{
v50=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((v50==this.FALSE)){{
{if (p46!=null) p46.send("_add_to_succ",false,this, p48, p49);}
clearArray(p47,false);
}
} else {{
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_succ",false,p46, p47, p48, p49);}
}
} else {{
{if (p46!=null) p46.send("_add_to_succ",false,p46, p48, p49);}
clearArray(p47,false);
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_succ: "+e.getMessage()); } return ;} long callCounter_add_to_succ;
protected void fun_add_to_succ(simulator.Node p52, int p53, int p54) { callCounter_add_to_succ++; try {
updateVisualization(v9,p52,true,"black",1,p53);
if(((length((List<Node>)copyEdgeArrayToNodeArray(v10,1))==2)&(length((List<Node>)copyEdgeArrayToNodeArray(v9,1))==2))){{
funset_range(p54);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_succ: "+e.getMessage()); } return ;} long callCounterupdate_range;
protected void funupdate_range(int p55) { callCounterupdate_range++; try {
setArrayIndex('=',v5,Arrays.asList(p55, 0),((double)0),Double.NaN,3);
setArrayIndex('=',v5,Arrays.asList(p55, 1),((double)1),Double.NaN,3);
funpred(p55, this, 0);funpred(p55, this, 1);funsucc(p55, this, 0);funsucc(p55, this, 1);}
 catch (ArithmeticException e){ print("arithmetic exception in update_range: "+e.getMessage()); } return ;} long callCounterset_range;
protected void funset_range(int p56) { callCounterset_range++; try {
if(((fung(id((getArrayIndex(v10,null,0)!=null?((Edge)(getArrayIndex(v10,null,0))).node:null)))==v3)|(fung(id((getArrayIndex(v10,null,1)!=null?((Edge)(getArrayIndex(v10,null,1))).node:null)))==v3))){{
setArrayIndex('=',v5,Arrays.asList(p56, 0),0.0,Double.NaN,3);
}
} else {{
if((fung(id((getArrayIndex(v10,null,0)!=null?((Edge)(getArrayIndex(v10,null,0))).node:null)))<fung(id((getArrayIndex(v10,null,1)!=null?((Edge)(getArrayIndex(v10,null,1))).node:null))))){{
setArrayIndex('=',v5,Arrays.asList(p56, 0),fung(id((getArrayIndex(v10,null,0)!=null?((Edge)(getArrayIndex(v10,null,0))).node:null))),Double.NaN,3);
}
} else {{
setArrayIndex('=',v5,Arrays.asList(p56, 0),fung(id((getArrayIndex(v10,null,1)!=null?((Edge)(getArrayIndex(v10,null,1))).node:null))),Double.NaN,3);
}
}}
}if(((fung(id((getArrayIndex(v9,null,0)!=null?((Edge)(getArrayIndex(v9,null,0))).node:null)))==v3)|(fung(id((getArrayIndex(v9,null,1)!=null?((Edge)(getArrayIndex(v9,null,1))).node:null)))==v3))){{
setArrayIndex('=',v5,Arrays.asList(p56, 1),1.0,Double.NaN,3);
}
} else {{
if((fung(id((getArrayIndex(v9,null,0)!=null?((Edge)(getArrayIndex(v9,null,0))).node:null)))>fung(id((getArrayIndex(v9,null,1)!=null?((Edge)(getArrayIndex(v9,null,1))).node:null))))){{
setArrayIndex('=',v5,Arrays.asList(p56, 1),fung(id((getArrayIndex(v9,null,0)!=null?((Edge)(getArrayIndex(v9,null,0))).node:null))),Double.NaN,3);
}
} else {{
setArrayIndex('=',v5,Arrays.asList(p56, 1),fung(id((getArrayIndex(v9,null,1)!=null?((Edge)(getArrayIndex(v9,null,1))).node:null))),Double.NaN,3);
}
}}
}clearArray(v9,true);
clearArray(v10,true);
funupdate_n(p56);}
 catch (ArithmeticException e){ print("arithmetic exception in set_range: "+e.getMessage()); } return ;} long callCounterupdate_n;
protected void funupdate_n(int p57) { callCounterupdate_n++; try {
double v58 = getArrayIndex(v5,Double.NaN,p57, 0);
double v59 = getArrayIndex(v5,Double.NaN,p57, 1);
funadd_to_n_for_left(p57, this, v58, v59);funadd_to_n_for_right(p57, this, v58, v59);}
 catch (ArithmeticException e){ print("arithmetic exception in update_n: "+e.getMessage()); } return ;} long callCounteradd_to_n_for_left;
protected void funadd_to_n_for_left(int p60, simulator.Node p61, double p62, double p63) { callCounteradd_to_n_for_left++; try {
if((p61!=this)){{
double v64 = fung(id(this));
if(((p62<=v64)&(v64<=p63))){{
{if (p61!=null) p61.send("_add_to_n",false,p60, this);}
}
}}
}if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_n_for_left",false,p60, p61, p62, p63);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_n_for_left: "+e.getMessage()); } return ;} long callCounteradd_to_n_for_right;
protected void funadd_to_n_for_right(int p65, simulator.Node p66, double p67, double p68) { callCounteradd_to_n_for_right++; try {
if((p66!=this)){{
double v69 = fung(id(this));
if(((p67<=v69)&(v69<=p68))){{
{if (p66!=null) p66.send("_add_to_n",false,p65, this);}
}
}}
}if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_n_for_right",false,p65, p66, p67, p68);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_n_for_right: "+e.getMessage()); } return ;} long callCounter_add_to_n;
protected void fun_add_to_n(int p70, simulator.Node p71) { callCounter_add_to_n++; try {
updateVisualization(v6,p71,true,"black",3,p70, getArrayIndex(v7,0,p70));
setArrayIndex('=',v7,Arrays.asList(p70),(getArrayIndex(v7,0,p70)+1),0,1);
}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_n: "+e.getMessage()); } return ;} long callCounterg;
protected double fung(int p72) { callCounterg++; try {
double v73 = hash(p72);
v73=(v73/Integer.MAX_VALUE);
v73=((v73+1)/2);
{if(this.TRUE)return v73;}}
 catch (ArithmeticException e){ print("arithmetic exception in g: "+e.getMessage()); } return Double.NaN;} long callCounterentry;
protected void funentry(simulator.Node p74) { callCounterentry++; try {
funlinearize(p74);}
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
protected void funlinearize(simulator.Node p75) { callCounterlinearize++; try {
if((fung(id(p75))<v3)){{
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)==null)){{
updateVisualization(v1,p75,true,"black",1,0);
}
} else {{
if((fung(id((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)))<fung(id(p75)))){{
{if (p75!=null) p75.send("linearize",false,(getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null));}
updateVisualization(v1,p75,true,"black",1,0);
}
} else {{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("linearize",false,p75);}
}
}}
}}
} else {if((fung(id(p75))>v3)){{
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)==null)){{
updateVisualization(v2,p75,true,"black",1,0);
}
} else {{
if((fung(id((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)))>fung(id(p75)))){{
{if (p75!=null) p75.send("linearize",false,(getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null));}
updateVisualization(v2,p75,true,"black",1,0);
}
} else {{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("linearize",false,p75);}
}
}}
}}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} }
