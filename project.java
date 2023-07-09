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
return new String[]{"SkipNode"};
}
public Node generateNode(String type, String name, boolean runSemisynchron){
if (type.equals("SkipNode")) return new nodeTypeSkipNode(name, runSemisynchron);
return null;
}
}class nodeTypeSkipNode extends Node{
public nodeTypeSkipNode (String name, boolean runSemisynchron){super(name,"SkipNode",runSemisynchron);}
List<Edge> v1 = new ArrayList<Edge>();
List<Edge> v2 = new ArrayList<Edge>();
double v3 = Double.NaN;
double v4 = Double.NaN;
List<List<Integer>> v5 = new ArrayList<List<Integer>>();
List<List<Double>> v6 = new ArrayList<List<Double>>();
List<List<Edge>> v7 = new ArrayList<List<Edge>>();
List<Integer> v8 = new ArrayList<Integer>();
int v9 = 64;
List<List<Edge>> v10 = new ArrayList<List<Edge>>();
List<List<Edge>> v11 = new ArrayList<List<Edge>>();
int v12 = 0;
@SuppressWarnings("unchecked")
public Entry<String, Object>[] getAttributes(){
return new SimpleEntry[] {
new SimpleEntry<String, Object>("left",v1), 
new SimpleEntry<String, Object>("right",v2), 
new SimpleEntry<String, Object>("hash_value",v3), 
new SimpleEntry<String, Object>("hash_value_bitstring",v4), 
new SimpleEntry<String, Object>("r",v5), 
new SimpleEntry<String, Object>("range",v6), 
new SimpleEntry<String, Object>("n",v7), 
new SimpleEntry<String, Object>("n_length",v8), 
new SimpleEntry<String, Object>("R_LENGTH",v9), 
new SimpleEntry<String, Object>("succs",v10), 
new SimpleEntry<String, Object>("preds",v11), 
new SimpleEntry<String, Object>("timeout_counter",v12)};}
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
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("P", "int [] 1")}));
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
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("P", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("update_range",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("set_range",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("P", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("update_n",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("P", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("add_to_n_for_left",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("L", "double"), 
new SimpleEntry<String, String>("R", "double"), 
new SimpleEntry<String, String>("P", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("add_to_n_for_right",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("L", "double"), 
new SimpleEntry<String, String>("R", "double"), 
new SimpleEntry<String, String>("P", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("_add_to_n",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("h",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("g",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("entry",new SimpleEntry[] {
new SimpleEntry<String, String>("C", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("timeout",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("_set_right",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("_set_left",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("linearize",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("quicksort",new SimpleEntry[] {
new SimpleEntry<String, String>("L", "int"), 
new SimpleEntry<String, String>("R", "int"), 
new SimpleEntry<String, String>("A", "simulator.Node [] 2"), 
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("teile",new SimpleEntry[] {
new SimpleEntry<String, String>("L", "int"), 
new SimpleEntry<String, String>("R", "int"), 
new SimpleEntry<String, String>("A", "simulator.Node [] 2"), 
new SimpleEntry<String, String>("I", "int")}));
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
attr.add(new SimpleEntry<String, Long>("h",callCounterh));
attr.add(new SimpleEntry<String, Long>("g",callCounterg));
attr.add(new SimpleEntry<String, Long>("entry",callCounterentry));
attr.add(new SimpleEntry<String, Long>("timeout",callCountertimeout));
attr.add(new SimpleEntry<String, Long>("_set_right",callCounter_set_right));
attr.add(new SimpleEntry<String, Long>("_set_left",callCounter_set_left));
attr.add(new SimpleEntry<String, Long>("linearize",callCounterlinearize));
attr.add(new SimpleEntry<String, Long>("quicksort",callCounterquicksort));
attr.add(new SimpleEntry<String, Long>("teile",callCounterteile));
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
fun_add_to_pred((simulator.Node)params[2], (int)params[3], (int)params[4], (List<Integer>)params[5]);if ((boolean)params[1]){
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
fun_add_to_succ((simulator.Node)params[2], (int)params[3], (int)params[4], (List<Integer>)params[5]);if ((boolean)params[1]){
print("_add_to_succ returned");
}
}
if (params[0].equals("update_range")){
Object result = funupdate_range((int)params[2]);
if ((boolean)params[1]){
print("update_range returns " + result);
}
}
if (params[0].equals("set_range")){
funset_range((int)params[2], (List<Integer>)params[3]);if ((boolean)params[1]){
print("set_range returned");
}
}
if (params[0].equals("update_n")){
funupdate_n((int)params[2], (List<Integer>)params[3]);if ((boolean)params[1]){
print("update_n returned");
}
}
if (params[0].equals("add_to_n_for_left")){
funadd_to_n_for_left((int)params[2], (simulator.Node)params[3], (double)params[4], (double)params[5], (List<Integer>)params[6]);if ((boolean)params[1]){
print("add_to_n_for_left returned");
}
}
if (params[0].equals("add_to_n_for_right")){
funadd_to_n_for_right((int)params[2], (simulator.Node)params[3], (double)params[4], (double)params[5], (List<Integer>)params[6]);if ((boolean)params[1]){
print("add_to_n_for_right returned");
}
}
if (params[0].equals("_add_to_n")){
fun_add_to_n((int)params[2], (simulator.Node)params[3]);if ((boolean)params[1]){
print("_add_to_n returned");
}
}
if (params[0].equals("h")){
Object result = funh((int)params[2]);
if ((boolean)params[1]){
print("h returns " + result);
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
if (params[0].equals("_set_right")){
fun_set_right((simulator.Node)params[2], (int)params[3]);if ((boolean)params[1]){
print("_set_right returned");
}
}
if (params[0].equals("_set_left")){
fun_set_left((simulator.Node)params[2], (int)params[3]);if ((boolean)params[1]){
print("_set_left returned");
}
}
if (params[0].equals("linearize")){
funlinearize((simulator.Node)params[2]);if ((boolean)params[1]){
print("linearize returned");
}
}
if (params[0].equals("quicksort")){
Object result = funquicksort((int)params[2], (int)params[3], (List<List<simulator.Node>>)params[4], (int)params[5]);
if ((boolean)params[1]){
print("quicksort returns " + result);
}
}
if (params[0].equals("teile")){
Object result = funteile((int)params[2], (int)params[3], (List<List<simulator.Node>>)params[4], (int)params[5]);
if ((boolean)params[1]){
print("teile returns " + result);
}
}
}
long callCounterinit;
protected void funinit() { callCounterinit++; try {
v3=funh(id(this));
v4=fung(id(this));
funfloatToBitstringCache(v4, v9, v5, id(this));}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCounterfloatToBitstringCache;
protected void funfloatToBitstringCache(double p13, int p14, List<List<Integer>> p15, int p16) { callCounterfloatToBitstringCache++; try {
double v17 = p13;
int v18 = 0;
double v19 = Double.NaN;
for(v18=0;(v18<p14);v18=v18+1){{
v19=(v17*2.0);
if((v19>=1)){{
setArrayIndex('=',p15,Arrays.asList(p16, v18),1,0,3);
v17=(v19-1.0);
}
} else {if((v19<1)){{
setArrayIndex('=',p15,Arrays.asList(p16, v18),0,0,3);
v17=v19;
}
}}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in floatToBitstringCache: "+e.getMessage()); } return ;} long callCounterfloatToBitstring;
protected void funfloatToBitstring(double p20, int p21, List<Integer> p22) { callCounterfloatToBitstring++; try {
clearArray(p22,false);
double v23 = p20;
int v24 = 0;
double v25 = Double.NaN;
for(v24=0;(v24<p21);v24=v24+1){{
v25=(v23*2.0);
if((v25>1)){{
addArrayEnd(p22,1);
v23=(v25-1.0);
}
} else {if((v25<1)){{
addArrayEnd(p22,0);
v23=v25;
}
}}}
}while((length(p22)<p21)){{
addArrayEnd(p22,0);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in floatToBitstring: "+e.getMessage()); } return ;} long callCounterprefix;
protected void funprefix(int p26, simulator.Node p27, List<Integer> p28) { callCounterprefix++; try {
List<Integer> v29 = new ArrayList<Integer>();
funfloatToBitstring(fung(id(p27)), v9, v29);clearArray(p28,false);
int v30 = 0;
for(v30=0;(v30<p26);v30=v30+1){{
addArrayEnd(p28,getArrayIndex(v29,0,v30));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in prefix: "+e.getMessage()); } return ;} long callCounterpred;
protected void funpred(int p31, simulator.Node p32, int p33) { callCounterpred++; try {
List<Integer> v34 = new ArrayList<Integer>();
funprefix(p31, p32, v34);addArrayEnd(v34,p33);
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_pred",false,this, v34, p33, p31);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in pred: "+e.getMessage()); } return ;} long callCounteradd_to_pred;
protected void funadd_to_pred(simulator.Node p35, List<Integer> p36, int p37, int p38) { callCounteradd_to_pred++; try {
boolean v39 = this.FALSE;
int v40 = 0;
for(v40=0;(v40<length(p36));v40=v40+1){{
if((getArrayIndex(p36,0,v40)!=getArrayIndex(v5,0,id(this), v40))){{
v39=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((v39==this.FALSE)){{
removeArrayIndex(p36,p36.size()-1,0);
{if (p35!=null) p35.send("_add_to_pred",false,this, p37, p38, p36);}
}
} else {{
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_pred",false,p35, p36, p37, p38);}
}
} else {{
removeArrayIndex(p36,p36.size()-1,0);
{if (p35!=null) p35.send("_add_to_pred",false,p35, p37, p38, p36);}
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_pred: "+e.getMessage()); } return ;} long callCounter_add_to_pred;
protected void fun_add_to_pred(simulator.Node p41, int p42, int p43, List<Integer> p44) { callCounter_add_to_pred++; try {
updateVisualization(v11,p41,true,"hidden",3,p43, p42);
if((((((getArrayIndex(v11,null,p43, 0)!=null?((Edge)(getArrayIndex(v11,null,p43, 0))).node:null)!=null)&((getArrayIndex(v11,null,p43, 1)!=null?((Edge)(getArrayIndex(v11,null,p43, 1))).node:null)!=null))&((getArrayIndex(v10,null,p43, 0)!=null?((Edge)(getArrayIndex(v10,null,p43, 0))).node:null)!=null))&((getArrayIndex(v10,null,p43, 1)!=null?((Edge)(getArrayIndex(v10,null,p43, 1))).node:null)!=null))){{
funset_range(p43, p44);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_pred: "+e.getMessage()); } return ;} long callCountersucc;
protected void funsucc(int p45, simulator.Node p46, int p47) { callCountersucc++; try {
List<Integer> v48 = new ArrayList<Integer>();
funprefix(p45, p46, v48);addArrayEnd(v48,p47);
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_succ",false,this, v48, p47, p45);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in succ: "+e.getMessage()); } return ;} long callCounteradd_to_succ;
protected void funadd_to_succ(simulator.Node p49, List<Integer> p50, int p51, int p52) { callCounteradd_to_succ++; try {
boolean v53 = this.FALSE;
int v54 = 0;
for(v54=0;(v54<length(p50));v54=v54+1){{
if((getArrayIndex(p50,0,v54)!=getArrayIndex(v5,0,id(this), v54))){{
v53=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((v53==this.FALSE)){{
removeArrayIndex(p50,p50.size()-1,0);
{if (p49!=null) p49.send("_add_to_succ",false,this, p51, p52, p50);}
}
} else {{
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_succ",false,p49, p50, p51, p52);}
}
} else {{
removeArrayIndex(p50,p50.size()-1,0);
{if (p49!=null) p49.send("_add_to_succ",false,p49, p51, p52, p50);}
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_succ: "+e.getMessage()); } return ;} long callCounter_add_to_succ;
protected void fun_add_to_succ(simulator.Node p55, int p56, int p57, List<Integer> p58) { callCounter_add_to_succ++; try {
updateVisualization(v10,p55,true,"hidden",3,p57, p56);
if((((((getArrayIndex(v11,null,p57, 0)!=null?((Edge)(getArrayIndex(v11,null,p57, 0))).node:null)!=null)&((getArrayIndex(v11,null,p57, 1)!=null?((Edge)(getArrayIndex(v11,null,p57, 1))).node:null)!=null))&((getArrayIndex(v10,null,p57, 0)!=null?((Edge)(getArrayIndex(v10,null,p57, 0))).node:null)!=null))&((getArrayIndex(v10,null,p57, 1)!=null?((Edge)(getArrayIndex(v10,null,p57, 1))).node:null)!=null))){{
funset_range(p57, p58);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_succ: "+e.getMessage()); } return ;} long callCounterupdate_range;
protected int funupdate_range(int p59) { callCounterupdate_range++; try {
updateVisualization(v11,null,true,"hidden",3,p59, 0);
updateVisualization(v11,null,true,"hidden",3,p59, 1);
updateVisualization(v10,null,true,"hidden",3,p59, 0);
updateVisualization(v10,null,true,"hidden",3,p59, 1);
setArrayIndex('=',v6,Arrays.asList(p59, 0),((double)0),Double.NaN,3);
setArrayIndex('=',v6,Arrays.asList(p59, 1),((double)1),Double.NaN,3);
funpred(p59, this, 0);funpred(p59, this, 1);funsucc(p59, this, 0);funsucc(p59, this, 1);{if(this.TRUE)return 0;}}
 catch (ArithmeticException e){ print("arithmetic exception in update_range: "+e.getMessage()); } return 0;} long callCounterset_range;
protected void funset_range(int p60, List<Integer> p61) { callCounterset_range++; try {
if(((funh(id((getArrayIndex(v11,null,p60, 0)!=null?((Edge)(getArrayIndex(v11,null,p60, 0))).node:null)))==v3)|(funh(id((getArrayIndex(v11,null,p60, 1)!=null?((Edge)(getArrayIndex(v11,null,p60, 1))).node:null)))==v3))){{
setArrayIndex('=',v6,Arrays.asList(p60, 0),0.0,Double.NaN,3);
}
} else {{
if((funh(id((getArrayIndex(v11,null,p60, 0)!=null?((Edge)(getArrayIndex(v11,null,p60, 0))).node:null)))<funh(id((getArrayIndex(v11,null,p60, 1)!=null?((Edge)(getArrayIndex(v11,null,p60, 1))).node:null))))){{
setArrayIndex('=',v6,Arrays.asList(p60, 0),funh(id((getArrayIndex(v11,null,p60, 0)!=null?((Edge)(getArrayIndex(v11,null,p60, 0))).node:null))),Double.NaN,3);
}
} else {{
setArrayIndex('=',v6,Arrays.asList(p60, 0),funh(id((getArrayIndex(v11,null,p60, 1)!=null?((Edge)(getArrayIndex(v11,null,p60, 1))).node:null))),Double.NaN,3);
}
}}
}if(((funh(id((getArrayIndex(v10,null,p60, 0)!=null?((Edge)(getArrayIndex(v10,null,p60, 0))).node:null)))==v3)|(funh(id((getArrayIndex(v10,null,p60, 1)!=null?((Edge)(getArrayIndex(v10,null,p60, 1))).node:null)))==v3))){{
setArrayIndex('=',v6,Arrays.asList(p60, 1),1.0,Double.NaN,3);
}
} else {{
if((funh(id((getArrayIndex(v10,null,p60, 0)!=null?((Edge)(getArrayIndex(v10,null,p60, 0))).node:null)))>funh(id((getArrayIndex(v10,null,p60, 1)!=null?((Edge)(getArrayIndex(v10,null,p60, 1))).node:null))))){{
setArrayIndex('=',v6,Arrays.asList(p60, 1),funh(id((getArrayIndex(v10,null,p60, 0)!=null?((Edge)(getArrayIndex(v10,null,p60, 0))).node:null))),Double.NaN,3);
}
} else {{
setArrayIndex('=',v6,Arrays.asList(p60, 1),funh(id((getArrayIndex(v10,null,p60, 1)!=null?((Edge)(getArrayIndex(v10,null,p60, 1))).node:null))),Double.NaN,3);
}
}}
}funupdate_n(p60, p61);}
 catch (ArithmeticException e){ print("arithmetic exception in set_range: "+e.getMessage()); } return ;} long callCounterupdate_n;
protected void funupdate_n(int p62, List<Integer> p63) { callCounterupdate_n++; try {
int v64 = 0;
for(v64=0;(v64<getArrayIndex(v8,0,p62));v64=v64+1){{
updateVisualization(v7,null,true,"green",3,p62, v64);
}
}setArrayIndex('=',v8,Arrays.asList(p62),0,0,1);
double v65 = getArrayIndex(v6,Double.NaN,p62, 0);
double v66 = getArrayIndex(v6,Double.NaN,p62, 1);
funadd_to_n_for_left(p62, this, v65, v66, p63);funadd_to_n_for_right(p62, this, v65, v66, p63);}
 catch (ArithmeticException e){ print("arithmetic exception in update_n: "+e.getMessage()); } return ;} long callCounteradd_to_n_for_left;
protected void funadd_to_n_for_left(int p67, simulator.Node p68, double p69, double p70, List<Integer> p71) { callCounteradd_to_n_for_left++; try {
double v72 = funh(id(this));
if((p68!=this)){{
boolean v73 = this.FALSE;
int v74 = 0;
for(v74=0;(v74<length(p71));v74=v74+1){{
if((getArrayIndex(p71,0,v74)!=getArrayIndex(v5,0,id(this), v74))){{
v73=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((((p69<=v72)&(v72<=p70))&(v73==this.FALSE))){{
{if (p68!=null) p68.send("_add_to_n",false,p67, this);}
}
}}
}if((((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)&(p69<=v72))){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_n_for_left",false,p67, p68, p69, p70, p71);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_n_for_left: "+e.getMessage()); } return ;} long callCounteradd_to_n_for_right;
protected void funadd_to_n_for_right(int p75, simulator.Node p76, double p77, double p78, List<Integer> p79) { callCounteradd_to_n_for_right++; try {
double v80 = funh(id(this));
if((p76!=this)){{
boolean v81 = this.FALSE;
int v82 = 0;
for(v82=0;(v82<length(p79));v82=v82+1){{
if((getArrayIndex(p79,0,v82)!=getArrayIndex(v5,0,id(this), v82))){{
v81=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((((p77<=v80)&(v80<=p78))&(v81==this.FALSE))){{
{if (p76!=null) p76.send("_add_to_n",false,p75, this);}
}
}}
}if((((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)&(v80<=p78))){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_n_for_right",false,p75, p76, p77, p78, p79);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_n_for_right: "+e.getMessage()); } return ;} long callCounter_add_to_n;
protected void fun_add_to_n(int p83, simulator.Node p84) { callCounter_add_to_n++; try {
int v85 = 0;
for(v85=0;(v85<getArrayIndex(v8,0,p83));v85=v85+1){{
if(((getArrayIndex(v7,null,p83, v85)!=null?((Edge)(getArrayIndex(v7,null,p83, v85))).node:null)==p84)){{
{if(this.TRUE)return ;}}
}}
}updateVisualization(v7,p84,true,"green",3,p83, getArrayIndex(v8,0,p83));
setArrayIndex('=',v8,Arrays.asList(p83),(getArrayIndex(v8,0,p83)+1),0,1);
}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_n: "+e.getMessage()); } return ;} long callCounterh;
protected double funh(int p86) { callCounterh++; try {
double v87 = hash(p86);
v87=(v87/Integer.MAX_VALUE);
v87=((v87+1)/2);
{if(this.TRUE)return v87;}}
 catch (ArithmeticException e){ print("arithmetic exception in h: "+e.getMessage()); } return Double.NaN;} long callCounterg;
protected double fung(int p88) { callCounterg++; try {
double v89 = hash1(p88);
v89=(v89/Integer.MAX_VALUE);
v89=((v89+1)/2);
{if(this.TRUE)return v89;}}
 catch (ArithmeticException e){ print("arithmetic exception in g: "+e.getMessage()); } return Double.NaN;} long callCounterentry;
protected void funentry(simulator.Node p90) { callCounterentry++; try {
funlinearize(p90);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
v12=v12+1;
if((((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)&(funh(id((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)))<v3))){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("linearize",false,this);}
}
} else {{
{if (this!=null) this.send("linearize",false,(getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null));}
updateVisualization(v1,null,true,"black",1,0);
}
}if((((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)&(funh(id((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)))>v3))){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("linearize",false,this);}
}
} else {{
{if (this!=null) this.send("linearize",false,(getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null));}
updateVisualization(v2,null,true,"black",1,0);
}
}int v91 = 0;
for(v91=1;(v91<(v9/8));v91=v91+1){{
if(((v12%100)==0)){{
funupdate_range(v91);}
}if(((v12%100)==50)){{
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounter_set_right;
protected void fun_set_right(simulator.Node p92, int p93) { callCounter_set_right++; try {
updateVisualization(v2,p92,true,"black",1,p93);
}
 catch (ArithmeticException e){ print("arithmetic exception in _set_right: "+e.getMessage()); } return ;} long callCounter_set_left;
protected void fun_set_left(simulator.Node p94, int p95) { callCounter_set_left++; try {
updateVisualization(v1,p94,true,"black",1,p95);
}
 catch (ArithmeticException e){ print("arithmetic exception in _set_left: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p96) { callCounterlinearize++; try {
if((funh(id(p96))<v3)){{
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)==null)){{
updateVisualization(v1,p96,true,"black",1,0);
}
} else {{
if((funh(id((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)))<funh(id(p96)))){{
{if (p96!=null) p96.send("linearize",false,(getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null));}
updateVisualization(v1,p96,true,"black",1,0);
}
} else {{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("linearize",false,p96);}
}
}}
}}
} else {if((funh(id(p96))>v3)){{
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)==null)){{
updateVisualization(v2,p96,true,"black",1,0);
}
} else {{
if((funh(id((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)))>funh(id(p96)))){{
{if (p96!=null) p96.send("linearize",false,(getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null));}
updateVisualization(v2,p96,true,"black",1,0);
}
} else {{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("linearize",false,p96);}
}
}}
}}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} long callCounterquicksort;
protected int funquicksort(int p97, int p98, List<List<simulator.Node>> p99, int p100) { callCounterquicksort++; try {
if((p97<p98)){{
int v101 = funteile(p97, p98, p99, p100);
funquicksort(p97, (v101-1), p99, p100);funquicksort((v101+1), p98, p99, p100);}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in quicksort: "+e.getMessage()); } return 0;} long callCounterteile;
protected int funteile(int p102, int p103, List<List<simulator.Node>> p104, int p105) { callCounterteile++; try {
int v106 = p102;
int v107 = (p103-1);
double v108 = funh(id(getArrayIndex(p104,null,p105, p103)));
while((v106<v107)){{
while(((v106<v107)&(funh(id(getArrayIndex(p104,null,p105, v106)))<=v108))){{
v106=(v106+1);
}
}while(((v107>v106)&(funh(id(getArrayIndex(p104,null,p105, v107)))>v108))){{
v107=(v107-1);
}
}if((funh(id(getArrayIndex(p104,null,p105, v106)))>funh(id(getArrayIndex(p104,null,p105, v107))))){{
simulator.Node v109 = getArrayIndex(p104,null,p105, v106);
setArrayIndex('=',p104,Arrays.asList(p105, v106),getArrayIndex(p104,null,p105, v107),null,3);
setArrayIndex('=',p104,Arrays.asList(p105, v107),v109,null,3);
}
}}
}if((funh(id(getArrayIndex(p104,null,p105, v106)))>v108)){{
simulator.Node v110 = getArrayIndex(p104,null,p105, v106);
setArrayIndex('=',p104,Arrays.asList(p105, v106),getArrayIndex(p104,null,p105, p103),null,3);
setArrayIndex('=',p104,Arrays.asList(p105, p103),v110,null,3);
}
} else {{
v106=p103;
}
}{if(this.TRUE)return v106;}}
 catch (ArithmeticException e){ print("arithmetic exception in teile: "+e.getMessage()); } return 0;} }
