// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.compiler.plugin
import _root_.scalapb.internal.compat.JavaConverters._

/** The plugin writes an encoded CodeGeneratorResponse to stdout.
  *
  * @param error
  *   Error message.  If non-empty, code generation failed.  The plugin process
  *   should exit with status code zero even if it reports an error in this way.
  *  
  *   This should be used to indicate errors in .proto files which prevent the
  *   code generator from generating correct code.  Errors which indicate a
  *   problem in protoc itself -- such as the input CodeGeneratorRequest being
  *   unparseable -- should be reported by writing a message to stderr and
  *   exiting with a non-zero status code.
  */
@SerialVersionUID(0L)
final case class CodeGeneratorResponse(
    error: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    file: _root_.scala.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[CodeGeneratorResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (error.isDefined) {
        val __value = error.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      file.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      error.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      file.foreach { __v =>
        val __m = __v
        _output__.writeTag(15, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def getError: _root_.scala.Predef.String = error.getOrElse("")
    def clearError: CodeGeneratorResponse = copy(error = _root_.scala.None)
    def withError(__v: _root_.scala.Predef.String): CodeGeneratorResponse = copy(error = Option(__v))
    def clearFile = copy(file = _root_.scala.Seq.empty)
    def addFile(__vs: com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File*): CodeGeneratorResponse = addAllFile(__vs)
    def addAllFile(__vs: Iterable[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]): CodeGeneratorResponse = copy(file = file ++ __vs)
    def withFile(__v: _root_.scala.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]): CodeGeneratorResponse = copy(file = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => error.orNull
        case 15 => file
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => error.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 15 => _root_.scalapb.descriptors.PRepeated(file.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.compiler.plugin.CodeGeneratorResponse
    // @@protoc_insertion_point(GeneratedMessage[google.protobuf.compiler.CodeGeneratorResponse])
}

object CodeGeneratorResponse extends scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse] with scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorResponse, com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse] with scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorResponse, com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse] = this
  override protected def actualParseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.CodeGeneratorResponse = newBuilder.merge(input).result()
  def toJavaProto(scalaPbSource: com.google.protobuf.compiler.plugin.CodeGeneratorResponse): com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse = {
    val javaPbOut = com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.newBuilder
    scalaPbSource.error.foreach(javaPbOut.setError)
    javaPbOut.addAllFile(_root_.scalapb.internal.compat.toIterable(scalaPbSource.file.iterator.map(com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File.toJavaProto(_))).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse): com.google.protobuf.compiler.plugin.CodeGeneratorResponse = com.google.protobuf.compiler.plugin.CodeGeneratorResponse(
    error = if (javaPbSource.hasError) Some(javaPbSource.getError) else _root_.scala.None,
    file = javaPbSource.getFileList.asScala.iterator.map(com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File.fromJavaProto(_)).toSeq
  )
  def merge(`_message__`: com.google.protobuf.compiler.plugin.CodeGeneratorResponse, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.CodeGeneratorResponse = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.compiler.plugin.CodeGeneratorResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.compiler.plugin.CodeGeneratorResponse(
        error = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        file = __fieldsMap.get(scalaDescriptor.findFieldByNumber(15).get).map(_.as[_root_.scala.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PluginProto.javaDescriptor.getMessageTypes().get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PluginProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 15 => __out = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.compiler.plugin.CodeGeneratorResponse(
    error = _root_.scala.None,
    file = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __error: _root_.scala.Option[_root_.scala.Predef.String],
    private var __file: _root_.scala.collection.mutable.Builder[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File, _root_.scala.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.compiler.plugin.CodeGeneratorResponse] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __error = Option(_input__.readStringRequireUtf8())
          case 122 =>
            __file += _root_.scalapb.LiteParser.readMessage[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File](_input__)
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.compiler.plugin.CodeGeneratorResponse = {
      com.google.protobuf.compiler.plugin.CodeGeneratorResponse(
        error = __error,
        file = __file.result(),
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse, com.google.protobuf.compiler.plugin.CodeGeneratorResponse.Builder] {
    def apply(): Builder = new Builder(
      __error = _root_.scala.None,
      __file = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File],
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.compiler.plugin.CodeGeneratorResponse): Builder = new Builder(
        __error = _message__.error,
        __file = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] ++= _message__.file,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.Builder()
  def newBuilder(`_message__`: com.google.protobuf.compiler.plugin.CodeGeneratorResponse): Builder = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.Builder(_message__)
  /** Represents a single generated file.
    *
    * @param name
    *   The file name, relative to the output directory.  The name must not
    *   contain "." or ".." components and must be relative, not be absolute (so,
    *   the file cannot lie outside the output directory).  "/" must be used as
    *   the path separator, not "&92;".
    *  
    *   If the name is omitted, the content will be appended to the previous
    *   file.  This allows the generator to break large files into small chunks,
    *   and allows the generated text to be streamed back to protoc so that large
    *   files need not reside completely in memory at one time.  Note that as of
    *   this writing protoc does not optimize for this -- it will read the entire
    *   CodeGeneratorResponse before writing files to disk.
    * @param insertionPoint
    *   If non-empty, indicates that the named file should already exist, and the
    *   content here is to be inserted into that file at a defined insertion
    *   point.  This feature allows a code generator to extend the output
    *   produced by another code generator.  The original generator may provide
    *   insertion points by placing special annotations in the file that look
    *   like:
    *     &#64;&#64;protoc_insertion_point(NAME)
    *   The annotation can have arbitrary text before and after it on the line,
    *   which allows it to be placed in a comment.  NAME should be replaced with
    *   an identifier naming the point -- this is what other generators will use
    *   as the insertion_point.  Code inserted at this point will be placed
    *   immediately above the line containing the insertion point (thus multiple
    *   insertions to the same point will come out in the order they were added).
    *   The double-&#64; is intended to make it unlikely that the generated code
    *   could contain things that look like insertion points by accident.
    *  
    *   For example, the C++ code generator places the following line in the
    *   .pb.h files that it generates:
    *     // &#64;&#64;protoc_insertion_point(namespace_scope)
    *   This line appears within the scope of the file's package namespace, but
    *   outside of any particular class.  Another plugin can then specify the
    *   insertion_point "namespace_scope" to generate additional classes or
    *   other declarations that should be placed in this scope.
    *  
    *   Note that if the line containing the insertion point begins with
    *   whitespace, the same whitespace will be added to every line of the
    *   inserted text.  This is useful for languages like Python, where
    *   indentation matters.  In these languages, the insertion point comment
    *   should be indented the same amount as any inserted code will need to be
    *   in order to work correctly in that context.
    *  
    *   The code generator that generates the initial file and the one which
    *   inserts into it must both run as part of a single invocation of protoc.
    *   Code generators are executed in the order in which they appear on the
    *   command line.
    *  
    *   If |insertion_point| is present, |name| must also be present.
    * @param content
    *   The file contents.
    */
  @SerialVersionUID(0L)
  final case class File(
      name: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
      insertionPoint: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
      content: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[File] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (name.isDefined) {
          val __value = name.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        };
        if (insertionPoint.isDefined) {
          val __value = insertionPoint.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        };
        if (content.isDefined) {
          val __value = content.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(15, __value)
        };
        __size += unknownFields.serializedSize
        __size
      }
      override def serializedSize: _root_.scala.Int = {
        var read = __serializedSizeCachedValue
        if (read == 0) {
          read = __computeSerializedValue()
          __serializedSizeCachedValue = read
        }
        read
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
        name.foreach { __v =>
          val __m = __v
          _output__.writeString(1, __m)
        };
        insertionPoint.foreach { __v =>
          val __m = __v
          _output__.writeString(2, __m)
        };
        content.foreach { __v =>
          val __m = __v
          _output__.writeString(15, __m)
        };
        unknownFields.writeTo(_output__)
      }
      def getName: _root_.scala.Predef.String = name.getOrElse("")
      def clearName: File = copy(name = _root_.scala.None)
      def withName(__v: _root_.scala.Predef.String): File = copy(name = Option(__v))
      def getInsertionPoint: _root_.scala.Predef.String = insertionPoint.getOrElse("")
      def clearInsertionPoint: File = copy(insertionPoint = _root_.scala.None)
      def withInsertionPoint(__v: _root_.scala.Predef.String): File = copy(insertionPoint = Option(__v))
      def getContent: _root_.scala.Predef.String = content.getOrElse("")
      def clearContent: File = copy(content = _root_.scala.None)
      def withContent(__v: _root_.scala.Predef.String): File = copy(content = Option(__v))
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => name.orNull
          case 2 => insertionPoint.orNull
          case 15 => content.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => name.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 2 => insertionPoint.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 15 => content.map(_root_.scalapb.descriptors.PString(_)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File
      // @@protoc_insertion_point(GeneratedMessage[google.protobuf.compiler.CodeGeneratorResponse.File])
  }
  
  object File extends scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] with scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File, com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] with scalapb.JavaProtoSupport[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File, com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File] = this
    override protected def actualParseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File = newBuilder.merge(input).result()
    def toJavaProto(scalaPbSource: com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File): com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File = {
      val javaPbOut = com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File.newBuilder
      scalaPbSource.name.foreach(javaPbOut.setName)
      scalaPbSource.insertionPoint.foreach(javaPbOut.setInsertionPoint)
      scalaPbSource.content.foreach(javaPbOut.setContent)
      javaPbOut.build
    }
    def fromJavaProto(javaPbSource: com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File): com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File(
      name = if (javaPbSource.hasName) Some(javaPbSource.getName) else _root_.scala.None,
      insertionPoint = if (javaPbSource.hasInsertionPoint) Some(javaPbSource.getInsertionPoint) else _root_.scala.None,
      content = if (javaPbSource.hasContent) Some(javaPbSource.getContent) else _root_.scala.None
    )
    def merge(`_message__`: com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File = newBuilder(_message__).merge(_input__).result()
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File(
          name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
          insertionPoint = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
          content = __fieldsMap.get(scalaDescriptor.findFieldByNumber(15).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File(
      name = _root_.scala.None,
      insertionPoint = _root_.scala.None,
      content = _root_.scala.None
    )
    final class Builder private (
      private var __name: _root_.scala.Option[_root_.scala.Predef.String],
      private var __insertionPoint: _root_.scala.Option[_root_.scala.Predef.String],
      private var __content: _root_.scala.Option[_root_.scala.Predef.String],
      private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
    ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File] {
      def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __name = Option(_input__.readStringRequireUtf8())
            case 18 =>
              __insertionPoint = Option(_input__.readStringRequireUtf8())
            case 122 =>
              __content = Option(_input__.readStringRequireUtf8())
            case tag =>
              if (_unknownFields__ == null) {
                _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
              }
              _unknownFields__.parseField(tag, _input__)
          }
        }
        this
      }
      def result(): com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File = {
        com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File(
          name = __name,
          insertionPoint = __insertionPoint,
          content = __content,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
        )
      }
    }
    object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File, com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File.Builder] {
      def apply(): Builder = new Builder(
        __name = _root_.scala.None,
        __insertionPoint = _root_.scala.None,
        __content = _root_.scala.None,
        `_unknownFields__` = null
      )
      def apply(`_message__`: com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File): Builder = new Builder(
          __name = _message__.name,
          __insertionPoint = _message__.insertionPoint,
          __content = _message__.content,
          `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
      )
    }
    def newBuilder: Builder = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File.Builder()
    def newBuilder(`_message__`: com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File): Builder = com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File.Builder(_message__)
    implicit class FileLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File](_l) {
      def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getName)((c_, f_) => c_.copy(name = Option(f_)))
      def optionalName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
      def insertionPoint: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getInsertionPoint)((c_, f_) => c_.copy(insertionPoint = Option(f_)))
      def optionalInsertionPoint: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.insertionPoint)((c_, f_) => c_.copy(insertionPoint = f_))
      def content: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getContent)((c_, f_) => c_.copy(content = Option(f_)))
      def optionalContent: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.content)((c_, f_) => c_.copy(content = f_))
    }
    final val NAME_FIELD_NUMBER = 1
    final val INSERTION_POINT_FIELD_NUMBER = 2
    final val CONTENT_FIELD_NUMBER = 15
    def of(
      name: _root_.scala.Option[_root_.scala.Predef.String],
      insertionPoint: _root_.scala.Option[_root_.scala.Predef.String],
      content: _root_.scala.Option[_root_.scala.Predef.String]
    ): _root_.com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File = _root_.com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File(
      name,
      insertionPoint,
      content
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.compiler.CodeGeneratorResponse.File])
  }
  
  implicit class CodeGeneratorResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.compiler.plugin.CodeGeneratorResponse](_l) {
    def error: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getError)((c_, f_) => c_.copy(error = Option(f_)))
    def optionalError: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.error)((c_, f_) => c_.copy(error = f_))
    def file: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]] = field(_.file)((c_, f_) => c_.copy(file = f_))
  }
  final val ERROR_FIELD_NUMBER = 1
  final val FILE_FIELD_NUMBER = 15
  def of(
    error: _root_.scala.Option[_root_.scala.Predef.String],
    file: _root_.scala.Seq[com.google.protobuf.compiler.plugin.CodeGeneratorResponse.File]
  ): _root_.com.google.protobuf.compiler.plugin.CodeGeneratorResponse = _root_.com.google.protobuf.compiler.plugin.CodeGeneratorResponse(
    error,
    file
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.compiler.CodeGeneratorResponse])
}
