/**
 * generated by Xtext 2.17.0
 */
package com.spirit.ihe.generator;

import com.google.common.collect.Iterables;
import com.spirit.ihe.iHE.MainTgf;
import com.spirit.ihe.iHE.Profile;
import com.spirit.ihe.iHE.SecRequirements;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class IHEGenerator extends AbstractGenerator {
  private String packageGenerated;
  
  private String parentSAT;
  
  private String packageDirectory;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<MainTgf> _filter = Iterables.<MainTgf>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), MainTgf.class);
    for (final MainTgf e : _filter) {
      {
        String _genPackage = e.getGenPackage();
        boolean _tripleNotEquals = (_genPackage != null);
        if (_tripleNotEquals) {
          this.packageGenerated = e.getGenPackage();
          this.packageDirectory = this.packageGenerated.replace(".", "/");
          InputOutput.<String>println(((("Package generated is not null, so I am generating " + this.packageGenerated) + " in directory ") + 
            this.packageDirectory));
        } else {
          this.packageDirectory = this._iQualifiedNameProvider.getFullyQualifiedName(e).toString("/");
          InputOutput.<String>println(("No package to be generated, thus creating " + this.packageDirectory));
        }
        String _name = e.getName();
        String _plus = ((("Generating SAT: " + this.packageDirectory) + "/") + _name);
        InputOutput.<String>println(_plus);
        String _name_1 = e.getName();
        String _plus_1 = ((this.packageDirectory + "/") + _name_1);
        String _plus_2 = (_plus_1 + ".java");
        fsa.generateFile(_plus_2, this.compileSAT(e));
        this.parentSAT = e.getName();
        InputOutput.<String>println("Generating list of AllABBs.java");
        fsa.generateFile(((this.packageDirectory + "/") + "AllABBs.java"), this.compileLIST(e));
      }
    }
    Iterable<Profile> _filter_1 = Iterables.<Profile>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Profile.class);
    for (final Profile e_1 : _filter_1) {
      {
        InputOutput.<String>println("+++");
        InputOutput.<URI>println(resource.getURI());
        InputOutput.<Class<? extends Resource>>println(resource.getClass());
        InputOutput.<Profile>println(e_1);
        InputOutput.<Class<? extends Profile>>println(e_1.getClass());
        String _name = e_1.getName();
        String _plus = ((("Generating profile " + this.packageDirectory) + "/") + _name);
        String _plus_1 = (_plus + ".java");
        InputOutput.<String>println(_plus_1);
        InputOutput.<String>println("---");
        String _name_1 = e_1.getName();
        String _plus_2 = ((this.packageDirectory + "/") + _name_1);
        String _plus_3 = (_plus_2 + ".java");
        fsa.generateFile(_plus_3, this.compile(e_1));
      }
    }
  }
  
  public CharSequence compileLIST(final MainTgf e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((this.packageGenerated == null)) {
        _builder.append("package ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.eContainer());
        _builder.append(_fullyQualifiedName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("package ");
        _builder.append(this.packageGenerated);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.spirit.ihe.language.bb.ABB;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class AllABBs {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// instantiate all the ABBs");
    _builder.newLine();
    {
      EList<Profile> _prof = e.getProf();
      for(final Profile profiles : _prof) {
        _builder.append("\t");
        _builder.append("private final ");
        String _name = profiles.getName();
        _builder.append(_name, "\t");
        _builder.append(" ");
        String _lowerCase = profiles.getName().toLowerCase();
        _builder.append(_lowerCase, "\t");
        _builder.append(" = new ");
        String _name_1 = profiles.getName();
        _builder.append(_name_1, "\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("private final HashMap<String, ABB> abbList = new HashMap<>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Constructor. Here I instantiate the ABBs");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public AllABBs() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Instantiate the SAT");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_2 = e.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append(" ");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1, "\t\t");
    _builder.append(" = new ");
    String _name_3 = e.getName();
    _builder.append(_name_3, "\t\t");
    _builder.append("(");
    {
      EList<Profile> _prof_1 = e.getProf();
      for(final Profile profiles_1 : _prof_1) {
        String _lowerCase_2 = profiles_1.getName().toLowerCase();
        _builder.append(_lowerCase_2, "\t\t");
        _builder.append(", ");
      }
    }
    _builder.append(" 0);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Add this SAT as parent SAT");
    _builder.newLine();
    {
      EList<Profile> _prof_2 = e.getProf();
      for(final Profile profiles_2 : _prof_2) {
        _builder.append("\t\t");
        String _lowerCase_3 = profiles_2.getName().toLowerCase();
        _builder.append(_lowerCase_3, "\t\t");
        _builder.append(".getABB().addParentSAT(");
        String _lowerCase_4 = e.getName().toLowerCase();
        _builder.append(_lowerCase_4, "\t\t");
        _builder.append(".getSAT());");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("abbList.put(");
        String _lowerCase_5 = profiles_2.getName().toLowerCase();
        _builder.append(_lowerCase_5, "\t\t");
        _builder.append(".getABB().getName(), ");
        String _lowerCase_6 = profiles_2.getName().toLowerCase();
        _builder.append(_lowerCase_6, "\t\t");
        _builder.append(".getABB());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public HashMap<String, ABB> getAbbList() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return abbList;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileSAT(final MainTgf e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((this.packageGenerated == null)) {
        _builder.append("package ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.eContainer());
        _builder.append(_fullyQualifiedName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("package ");
        _builder.append(this.packageGenerated);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import com.spirit.ihe.language.bb.SAT;");
    _builder.newLine();
    _builder.append("import com.spirit.ihe.language.bb.dependencies.TFRule;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private SAT ");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private void initSAT(");
    {
      EList<Profile> _prof = e.getProf();
      for(final Profile profiles : _prof) {
        _builder.append(" ");
        String _name_1 = profiles.getName();
        _builder.append(_name_1, "\t");
        _builder.append(" ");
        String _lowerCase_1 = profiles.getName().toLowerCase();
        _builder.append(_lowerCase_1, "\t");
        _builder.append(", ");
      }
    }
    _builder.append(" int fake) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _lowerCase_2 = e.getName().toLowerCase();
    _builder.append(_lowerCase_2, "\t\t");
    _builder.append(" = new SAT(\"");
    String _satName = e.getSatName();
    _builder.append(_satName, "\t\t");
    _builder.append("\", \"");
    String _versionName = e.getVersionName();
    _builder.append(_versionName, "\t\t");
    _builder.append("\", \"");
    String _statusName = e.getStatusName();
    _builder.append(_statusName, "\t\t");
    _builder.append("\", \"");
    String _objectiveName = e.getObjectiveName();
    _builder.append(_objectiveName, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    {
      EList<String> _rules = e.getRules();
      for(final String rules : _rules) {
        _builder.append("\t\t");
        String _lowerCase_3 = e.getName().toLowerCase();
        _builder.append(_lowerCase_3, "\t\t");
        _builder.append(".addRule(new TFRule(");
        String _trim = rules.split(":")[1].trim();
        _builder.append(_trim, "\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Profile> _prof_1 = e.getProf();
      for(final Profile profiles_1 : _prof_1) {
        _builder.append("\t\t");
        String _lowerCase_4 = e.getName().toLowerCase();
        _builder.append(_lowerCase_4, "\t\t");
        _builder.append(".addSolutionPattern(");
        String _lowerCase_5 = profiles_1.getName().toLowerCase();
        _builder.append(_lowerCase_5, "\t\t");
        _builder.append(".getABB());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = e.getName();
    _builder.append(_name_2, "\t");
    _builder.append("(");
    {
      EList<Profile> _prof_2 = e.getProf();
      for(final Profile profiles_2 : _prof_2) {
        String _name_3 = profiles_2.getName();
        _builder.append(_name_3, "\t");
        _builder.append(" ");
        String _lowerCase_6 = profiles_2.getName().toLowerCase();
        _builder.append(_lowerCase_6, "\t");
        _builder.append(", ");
      }
    }
    _builder.append(" int fake) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.append("initSAT(");
    {
      EList<Profile> _prof_3 = e.getProf();
      for(final Profile profiles_3 : _prof_3) {
        _builder.append(" ");
        String _lowerCase_7 = profiles_3.getName().toLowerCase();
        _builder.append(_lowerCase_7, "\t    ");
        _builder.append(", ");
      }
    }
    _builder.append(" 0);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t                    \t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public SAT getSAT() {");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("return this.");
    String _lowerCase_8 = e.getName().toLowerCase();
    _builder.append(_lowerCase_8, "\t    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Profile e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((this.packageGenerated == null)) {
        _builder.append("package ");
        QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(e.eContainer());
        _builder.append(_fullyQualifiedName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("package ");
        _builder.append(this.packageGenerated);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.newLine();
    _builder.append("import com.spirit.ihe.language.bb.ABB;");
    _builder.newLine();
    _builder.append("import com.spirit.ihe.language.bb.dependencies.Actor;");
    _builder.newLine();
    _builder.append("import com.spirit.ihe.language.bb.dependencies.Domain;");
    _builder.newLine();
    _builder.append("import com.spirit.ihe.language.bb.dependencies.QualityAttribute;");
    _builder.newLine();
    _builder.append("import com.spirit.ihe.language.bb.dependencies.Transaction;");
    _builder.newLine();
    _builder.append("import com.spirit.ihe.language.bb.dependencies.SecurityRequirement;");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("public class ");
    String _name = e.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private ABB ");
    String _lowerCase = e.getName().toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private void initP() {");
    _builder.newLine();
    _builder.append("        ");
    String _lowerCase_1 = e.getName().toLowerCase();
    _builder.append(_lowerCase_1, "        ");
    _builder.append(" = new ABB(\"");
    String _trim = e.getName().toUpperCase().trim();
    _builder.append(_trim, "        ");
    _builder.append("\", \"");
    String _descrName = e.getDescrName();
    _builder.append(_descrName, "        ");
    _builder.append("\", \"");
    String _featName = e.getFeatName();
    _builder.append(_featName, "        ");
    _builder.append("\", \"");
    String _functionName = e.getFunctionName();
    _builder.append(_functionName, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("                                                ");
    _builder.newLine();
    {
      EList<String> _actor = e.getActor();
      for(final String actors : _actor) {
        _builder.append("                ");
        _builder.append("Actor ");
        String _replaceAll = actors.toLowerCase().trim().replaceAll("^\"|\"$", "");
        _builder.append(_replaceAll, "                ");
        _builder.append(" = new Actor(\"");
        String _replaceAll_1 = actors.trim().replaceAll("^\"|\"$", "");
        _builder.append(_replaceAll_1, "                ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t        \t");
        String _lowerCase_2 = e.getName().toLowerCase();
        _builder.append(_lowerCase_2, "\t\t        \t");
        _builder.append(".addActor(");
        String _replaceAll_2 = actors.toLowerCase().trim().replaceAll("^\"|\"$", "");
        _builder.append(_replaceAll_2, "\t\t        \t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        \t");
    _builder.newLine();
    {
      EList<String> _transaction = e.getTransaction();
      for(final String transactions : _transaction) {
        _builder.append("        \t");
        _builder.append("Transaction ");
        String _replace = transactions.split(",")[1].trim().toLowerCase().replaceAll("^\"|\"$", "").replace("(", "").replace(")", "");
        _builder.append(_replace, "        \t");
        _builder.append(" = new Transaction(");
        String _replace_1 = transactions.split(",")[0].trim().replace("\"", "").toLowerCase().replace("(", "").replace(")", "");
        _builder.append(_replace_1, "        \t");
        _builder.append(", ");
        String _trim_1 = transactions.split(",")[1].trim();
        _builder.append(_trim_1, "        \t");
        _builder.append(", ");
        String _replace_2 = transactions.split(",")[2].trim().replace("\"", "").toLowerCase().replace("(", "").replace(")", "");
        _builder.append(_replace_2, "        \t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t");
        String _lowerCase_3 = e.getName().toLowerCase();
        _builder.append(_lowerCase_3, "        \t");
        _builder.append(".addTransaction(");
        String _replace_3 = transactions.split(",")[1].trim().toLowerCase().replaceAll("^\"|\"$", "").replace("(", "").replace(")", "");
        _builder.append(_replace_3, "        \t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t");
        _builder.append("                ");
        _builder.newLine();
      }
    }
    _builder.append("        \t");
    _builder.newLine();
    {
      EList<String> _domain = e.getDomain();
      for(final String domains : _domain) {
        _builder.append("        \t");
        _builder.append("Domain ");
        String _replaceAll_3 = domains.toLowerCase().trim().replaceAll("^\"|\"$", "");
        _builder.append(_replaceAll_3, "        \t");
        _builder.append(" = new Domain() { ");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t");
        _builder.append("    ");
        _builder.append("private String name = ");
        _builder.append(domains, "        \t    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t");
        _builder.append("    ");
        _builder.append("public String getName() { return name; }");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("};");
        _builder.newLine();
        _builder.append("        \t");
        String _lowerCase_4 = e.getName().toLowerCase();
        _builder.append(_lowerCase_4, "        \t");
        _builder.append(".addDomain(");
        String _replaceAll_4 = domains.toLowerCase().trim().replaceAll("^\"|\"$", "");
        _builder.append(_replaceAll_4, "        \t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        \t\t");
    _builder.newLine();
    {
      EList<String> _qualityattr = e.getQualityattr();
      for(final String qas : _qualityattr) {
        _builder.append("        \t\t");
        _builder.append("QualityAttribute ");
        String _get = qas.toLowerCase().trim().split(" ")[0];
        _builder.append(_get, "        \t\t");
        _builder.append(" = new QualityAttribute() {");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("private String value = ");
        String _replace_4 = qas.toLowerCase().trim().split(" ")[1].replace("[", "").replace("]", "");
        _builder.append(_replace_4, "        \t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t\t\t\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public void addRule(String value) {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("this.value = value;");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t\t\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public String getValue() {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("return this.value;");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t\t\t            ");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public void evaluate(ABB y, ABB y2) {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("// place your implementation here");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("};");
        _builder.newLine();
        _builder.append("        \t\t");
        String _lowerCase_5 = e.getName().toLowerCase();
        _builder.append(_lowerCase_5, "        \t\t");
        _builder.append(".addQualityAttribute(");
        String _get_1 = qas.toLowerCase().trim().split(" ")[0];
        _builder.append(_get_1, "        \t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        \t\t");
    _builder.newLine();
    {
      EList<SecRequirements> _secre = e.getSecre();
      for(final SecRequirements sre : _secre) {
        _builder.append("        \t\t");
        _builder.append("SecurityRequirement ");
        String _get_2 = sre.getSecReID().toLowerCase().trim().split(" ")[0];
        _builder.append(_get_2, "        \t\t");
        _builder.append(" = new SecurityRequirement() {");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("private String form = \"");
        String _secreForm = sre.getSecreForm();
        _builder.append(_secreForm, "        \t\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("private String sensitivity = \"");
        String _secreSensitivity = sre.getSecreSensitivity();
        _builder.append(_secreSensitivity, "        \t\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("private String location = \"");
        String _secreLocation = sre.getSecreLocation();
        _builder.append(_secreLocation, "        \t\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("private String state = \"");
        String _secreState = sre.getSecreState();
        _builder.append(_secreState, "        \t\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("private String goal = \"");
        String _secreGoal = sre.getSecreGoal();
        _builder.append(_secreGoal, "        \t\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("private String countermeasure = \"");
        String _secreCountermeasure = sre.getSecreCountermeasure();
        _builder.append(_secreCountermeasure, "        \t\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("private String category = \"");
        String _secreCategory = sre.getSecreCategory();
        _builder.append(_secreCategory, "        \t\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("private String name = \"");
        String _secReID = sre.getSecReID();
        _builder.append(_secReID, "        \t\t\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public String getName() {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t");
        _builder.append("return this.name;\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public String getForm() {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t");
        _builder.append("return this.form;\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public String getGoal() {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t");
        _builder.append("return this.goal;\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public String getLocation() {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t");
        _builder.append("return this.location;\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public String getSensitivity() {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t");
        _builder.append("return this.sensitivity;\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public String getState() {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t");
        _builder.append("return this.state;\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public String getCountermeasure() {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t");
        _builder.append("return this.countermeasure;\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("public String getCategory() {");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t\t");
        _builder.append("return this.category;\t");
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("        \t\t");
        _builder.append("};");
        _builder.newLine();
        _builder.append("        \t\t");
        String _lowerCase_6 = e.getName().toLowerCase();
        _builder.append(_lowerCase_6, "        \t\t");
        _builder.append(".addSecurityRequirements(");
        String _get_3 = sre.getSecReID().toLowerCase().trim().split(" ")[0];
        _builder.append(_get_3, "        \t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("        \t\t");
        _builder.newLine();
      }
    }
    _builder.append("        \t\t\t");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.append("public ");
    String _name_1 = e.getName();
    _builder.append(_name_1, "    \t\t\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t\t\t\t    ");
    _builder.append("initP();");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.newLine();
    _builder.append("    \t\t\t");
    _builder.append("public ABB getABB() {");
    _builder.newLine();
    _builder.append("    \t\t\t\t");
    _builder.append("return this.");
    String _lowerCase_7 = e.getName().toLowerCase();
    _builder.append(_lowerCase_7, "    \t\t\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
