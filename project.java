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
double v4 = Double.NaN;
List<List<Integer>> v5 = new ArrayList<List<Integer>>();
List<List<Double>> v6 = new ArrayList<List<Double>>();
List<List<Edge>> v7 = new ArrayList<List<Edge>>();
List<Integer> v8 = new ArrayList<Integer>();
int v9 = 64;
List<Edge> v10 = new ArrayList<Edge>();
List<Edge> v11 = new ArrayList<Edge>();
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
new SimpleEntry<String, Object>("preds",v11)};}
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
attr.add(new SimpleEntry<String, Long>("h",callCounterh));
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
funupdate_range((int)params[2]);if ((boolean)params[1]){
print("update_range returned");
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
if (params[0].equals("linearize")){
funlinearize((simulator.Node)params[2]);if ((boolean)params[1]){
print("linearize returned");
}
}
}
long callCounterinit;
protected void funinit() { callCounterinit++; try {
v3=funh(id(this));
v4=fung(id(this));
funfloatToBitstringCache(v4, v9, v5, id(this));}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCounterfloatToBitstringCache;
protected void funfloatToBitstringCache(double p12, int p13, List<List<Integer>> p14, int p15) { callCounterfloatToBitstringCache++; try {
double v16 = p12;
int v17 = 0;
double v18 = Double.NaN;
for(v17=0;(v17<p13);v17=v17+1){{
v18=(v16*2.0);
if((v18>=1)){{
setArrayIndex('=',p14,Arrays.asList(p15, v17),1,0,3);
v16=(v18-1.0);
}
} else {if((v18<1)){{
setArrayIndex('=',p14,Arrays.asList(p15, v17),0,0,3);
v16=v18;
}
}}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in floatToBitstringCache: "+e.getMessage()); } return ;} long callCounterfloatToBitstring;
protected void funfloatToBitstring(double p19, int p20, List<Integer> p21) { callCounterfloatToBitstring++; try {
clearArray(p21,false);
double v22 = p19;
int v23 = 0;
double v24 = Double.NaN;
for(v23=0;(v23<p20);v23=v23+1){{
v24=(v22*2.0);
if((v24>1)){{
addArrayEnd(p21,1);
v22=(v24-1.0);
}
} else {if((v24<1)){{
addArrayEnd(p21,0);
v22=v24;
}
}}}
}while((length(p21)<p20)){{
addArrayEnd(p21,0);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in floatToBitstring: "+e.getMessage()); } return ;} long callCounterprefix;
protected void funprefix(int p25, simulator.Node p26, List<Integer> p27) { callCounterprefix++; try {
List<Integer> v28 = new ArrayList<Integer>();
funfloatToBitstring(fung(id(p26)), v9, v28);clearArray(p27,false);
int v29 = 0;
for(v29=0;(v29<p25);v29=v29+1){{
addArrayEnd(p27,getArrayIndex(v28,0,v29));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in prefix: "+e.getMessage()); } return ;} long callCounterpred;
protected void funpred(int p30, simulator.Node p31, int p32) { callCounterpred++; try {
List<Integer> v33 = new ArrayList<Integer>();
funprefix(p30, p31, v33);addArrayEnd(v33,p32);
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_pred",false,this, v33, p32, p30);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in pred: "+e.getMessage()); } return ;} long callCounteradd_to_pred;
protected void funadd_to_pred(simulator.Node p34, List<Integer> p35, int p36, int p37) { callCounteradd_to_pred++; try {
boolean v38 = this.FALSE;
int v39 = 0;
for(v39=0;(v39<length(p35));v39=v39+1){{
if((getArrayIndex(p35,0,v39)!=getArrayIndex(v5,0,id(this), v39))){{
v38=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((v38==this.FALSE)){{
removeArrayIndex(p35,p35.size()-1,0);
{if (p34!=null) p34.send("_add_to_pred",false,this, p36, p37, p35);}
}
} else {{
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_pred",false,p34, p35, p36, p37);}
}
} else {{
removeArrayIndex(p35,p35.size()-1,0);
{if (p34!=null) p34.send("_add_to_pred",false,p34, p36, p37, p35);}
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_pred: "+e.getMessage()); } return ;} long callCounter_add_to_pred;
protected void fun_add_to_pred(simulator.Node p40, int p41, int p42, List<Integer> p43) { callCounter_add_to_pred++; try {
updateVisualization(v11,p40,true,"hidden",1,p41);
if(((length((List<Node>)copyEdgeArrayToNodeArray(v11,1))==2)&(length((List<Node>)copyEdgeArrayToNodeArray(v10,1))==2))){{
funset_range(p42, p43);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_pred: "+e.getMessage()); } return ;} long callCountersucc;
protected void funsucc(int p44, simulator.Node p45, int p46) { callCountersucc++; try {
List<Integer> v47 = new ArrayList<Integer>();
funprefix(p44, p45, v47);addArrayEnd(v47,p46);
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_succ",false,this, v47, p46, p44);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in succ: "+e.getMessage()); } return ;} long callCounteradd_to_succ;
protected void funadd_to_succ(simulator.Node p48, List<Integer> p49, int p50, int p51) { callCounteradd_to_succ++; try {
boolean v52 = this.FALSE;
int v53 = 0;
for(v53=0;(v53<length(p49));v53=v53+1){{
if((getArrayIndex(p49,0,v53)!=getArrayIndex(v5,0,id(this), v53))){{
v52=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((v52==this.FALSE)){{
removeArrayIndex(p49,p49.size()-1,0);
{if (p48!=null) p48.send("_add_to_succ",false,this, p50, p51, p49);}
}
} else {{
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_succ",false,p48, p49, p50, p51);}
}
} else {{
removeArrayIndex(p49,p49.size()-1,0);
{if (p48!=null) p48.send("_add_to_succ",false,p48, p50, p51, p49);}
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_succ: "+e.getMessage()); } return ;} long callCounter_add_to_succ;
protected void fun_add_to_succ(simulator.Node p54, int p55, int p56, List<Integer> p57) { callCounter_add_to_succ++; try {
updateVisualization(v10,p54,true,"hidden",1,p55);
if(((length((List<Node>)copyEdgeArrayToNodeArray(v11,1))==2)&(length((List<Node>)copyEdgeArrayToNodeArray(v10,1))==2))){{
funset_range(p56, p57);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_succ: "+e.getMessage()); } return ;} long callCounterupdate_range;
protected void funupdate_range(int p58) { callCounterupdate_range++; try {
clearArray(v11,true);
clearArray(v10,true);
setArrayIndex('=',v6,Arrays.asList(p58, 0),((double)0),Double.NaN,3);
setArrayIndex('=',v6,Arrays.asList(p58, 1),((double)1),Double.NaN,3);
funpred(p58, this, 0);funpred(p58, this, 1);funsucc(p58, this, 0);funsucc(p58, this, 1);}
 catch (ArithmeticException e){ print("arithmetic exception in update_range: "+e.getMessage()); } return ;} long callCounterset_range;
protected void funset_range(int p59, List<Integer> p60) { callCounterset_range++; try {
if(((funh(id((getArrayIndex(v11,null,0)!=null?((Edge)(getArrayIndex(v11,null,0))).node:null)))==v3)|(funh(id((getArrayIndex(v11,null,1)!=null?((Edge)(getArrayIndex(v11,null,1))).node:null)))==v3))){{
setArrayIndex('=',v6,Arrays.asList(p59, 0),0.0,Double.NaN,3);
}
} else {{
if((funh(id((getArrayIndex(v11,null,0)!=null?((Edge)(getArrayIndex(v11,null,0))).node:null)))<funh(id((getArrayIndex(v11,null,1)!=null?((Edge)(getArrayIndex(v11,null,1))).node:null))))){{
setArrayIndex('=',v6,Arrays.asList(p59, 0),funh(id((getArrayIndex(v11,null,0)!=null?((Edge)(getArrayIndex(v11,null,0))).node:null))),Double.NaN,3);
}
} else {{
setArrayIndex('=',v6,Arrays.asList(p59, 0),funh(id((getArrayIndex(v11,null,1)!=null?((Edge)(getArrayIndex(v11,null,1))).node:null))),Double.NaN,3);
}
}}
}if(((funh(id((getArrayIndex(v10,null,0)!=null?((Edge)(getArrayIndex(v10,null,0))).node:null)))==v3)|(funh(id((getArrayIndex(v10,null,1)!=null?((Edge)(getArrayIndex(v10,null,1))).node:null)))==v3))){{
setArrayIndex('=',v6,Arrays.asList(p59, 1),1.0,Double.NaN,3);
}
} else {{
if((funh(id((getArrayIndex(v10,null,0)!=null?((Edge)(getArrayIndex(v10,null,0))).node:null)))>funh(id((getArrayIndex(v10,null,1)!=null?((Edge)(getArrayIndex(v10,null,1))).node:null))))){{
setArrayIndex('=',v6,Arrays.asList(p59, 1),funh(id((getArrayIndex(v10,null,0)!=null?((Edge)(getArrayIndex(v10,null,0))).node:null))),Double.NaN,3);
}
} else {{
setArrayIndex('=',v6,Arrays.asList(p59, 1),funh(id((getArrayIndex(v10,null,1)!=null?((Edge)(getArrayIndex(v10,null,1))).node:null))),Double.NaN,3);
}
}}
}funupdate_n(p59, p60);}
 catch (ArithmeticException e){ print("arithmetic exception in set_range: "+e.getMessage()); } return ;} long callCounterupdate_n;
protected void funupdate_n(int p61, List<Integer> p62) { callCounterupdate_n++; try {
int v63 = 0;
for(v63=0;(v63<getArrayIndex(v8,0,p61));v63=v63+1){{
updateVisualization(v7,null,true,"green",3,p61, v63);
}
}setArrayIndex('=',v8,Arrays.asList(p61),0,0,1);
double v64 = getArrayIndex(v6,Double.NaN,p61, 0);
double v65 = getArrayIndex(v6,Double.NaN,p61, 1);
funadd_to_n_for_left(p61, this, v64, v65, p62);funadd_to_n_for_right(p61, this, v64, v65, p62);}
 catch (ArithmeticException e){ print("arithmetic exception in update_n: "+e.getMessage()); } return ;} long callCounteradd_to_n_for_left;
protected void funadd_to_n_for_left(int p66, simulator.Node p67, double p68, double p69, List<Integer> p70) { callCounteradd_to_n_for_left++; try {
double v71 = funh(id(this));
if((p67!=this)){{
boolean v72 = this.FALSE;
int v73 = 0;
for(v73=0;(v73<length(p70));v73=v73+1){{
if((getArrayIndex(p70,0,v73)!=getArrayIndex(v5,0,id(this), v73))){{
v72=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((((p68<=v71)&(v71<=p69))&(v72==this.FALSE))){{
{if (p67!=null) p67.send("_add_to_n",false,p66, this);}
}
}}
}if((((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null)&(p68<=v71))){{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("add_to_n_for_left",false,p66, p67, p68, p69, p70);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_n_for_left: "+e.getMessage()); } return ;} long callCounteradd_to_n_for_right;
protected void funadd_to_n_for_right(int p74, simulator.Node p75, double p76, double p77, List<Integer> p78) { callCounteradd_to_n_for_right++; try {
double v79 = funh(id(this));
if((p75!=this)){{
boolean v80 = this.FALSE;
int v81 = 0;
for(v81=0;(v81<length(p78));v81=v81+1){{
if((getArrayIndex(p78,0,v81)!=getArrayIndex(v5,0,id(this), v81))){{
v80=this.TRUE;
{if(this.TRUE)break;}}
}}
}if((((p76<=v79)&(v79<=p77))&(v80==this.FALSE))){{
{if (p75!=null) p75.send("_add_to_n",false,p74, this);}
}
}}
}if((((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null)&(v79<=p77))){{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("add_to_n_for_right",false,p74, p75, p76, p77, p78);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in add_to_n_for_right: "+e.getMessage()); } return ;} long callCounter_add_to_n;
protected void fun_add_to_n(int p82, simulator.Node p83) { callCounter_add_to_n++; try {
int v84 = 0;
for(v84=0;(v84<getArrayIndex(v8,0,p82));v84=v84+1){{
if(((getArrayIndex(v7,null,p82, v84)!=null?((Edge)(getArrayIndex(v7,null,p82, v84))).node:null)==p83)){{
{if(this.TRUE)return ;}}
}}
}updateVisualization(v7,p83,true,"green",3,p82, getArrayIndex(v8,0,p82));
setArrayIndex('=',v8,Arrays.asList(p82),(getArrayIndex(v8,0,p82)+1),0,1);
}
 catch (ArithmeticException e){ print("arithmetic exception in _add_to_n: "+e.getMessage()); } return ;} long callCounterh;
protected double funh(int p85) { callCounterh++; try {
double v86 = hash(p85);
v86=(v86/Integer.MAX_VALUE);
v86=((v86+1)/2);
{if(this.TRUE)return v86;}}
 catch (ArithmeticException e){ print("arithmetic exception in h: "+e.getMessage()); } return Double.NaN;} long callCounterg;
protected double fung(int p87) { callCounterg++; try {
double v88 = hash1(p87);
v88=(v88/Integer.MAX_VALUE);
v88=((v88+1)/2);
{if(this.TRUE)return v88;}}
 catch (ArithmeticException e){ print("arithmetic exception in g: "+e.getMessage()); } return Double.NaN;} long callCounterentry;
protected void funentry(simulator.Node p89) { callCounterentry++; try {
funlinearize(p89);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
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
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p90) { callCounterlinearize++; try {
if((funh(id(p90))<v3)){{
if(((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)==null)){{
updateVisualization(v1,p90,true,"black",1,0);
}
} else {{
if((funh(id((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)))<funh(id(p90)))){{
{if (p90!=null) p90.send("linearize",false,(getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null));}
updateVisualization(v1,p90,true,"black",1,0);
}
} else {{
{if ((getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null)!=null) (getArrayIndex(v1,null,0)!=null?((Edge)(getArrayIndex(v1,null,0))).node:null).send("linearize",false,p90);}
}
}}
}}
} else {if((funh(id(p90))>v3)){{
if(((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)==null)){{
updateVisualization(v2,p90,true,"black",1,0);
}
} else {{
if((funh(id((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)))>funh(id(p90)))){{
{if (p90!=null) p90.send("linearize",false,(getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null));}
updateVisualization(v2,p90,true,"black",1,0);
}
} else {{
{if ((getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null)!=null) (getArrayIndex(v2,null,0)!=null?((Edge)(getArrayIndex(v2,null,0))).node:null).send("linearize",false,p90);}
}
}}
}}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} }
