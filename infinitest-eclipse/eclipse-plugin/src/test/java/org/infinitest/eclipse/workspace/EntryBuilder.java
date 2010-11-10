package org.infinitest.eclipse.workspace;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.internal.core.ClasspathEntry;

class EntryBuilder
{
    private int contentKind;
    private int entryKind;
    private IPath path;
    private final IPath[] inclusionPatterns = new Path[0];
    private final IPath[] exclusionPatterns = new Path[0];
    private IPath sourceAttachmentPath;
    private IPath sourceAttachmentRootPath;
    private IPath outputPath;
    private boolean exported;
    private IAccessRule[] accessRules;
    private boolean combineAccessRules;
    private IClasspathAttribute[] extraAttributes;

    public IClasspathEntry build()
    {
        return new ClasspathEntry(contentKind, entryKind, path, inclusionPatterns, exclusionPatterns,
                        sourceAttachmentPath, sourceAttachmentRootPath, outputPath, exported, accessRules,
                        combineAccessRules, extraAttributes);
    }

    public EntryBuilder exported(boolean isExported)
    {
        this.exported = isExported;
        return this;
    }

    public EntryBuilder contentKind(int kind)
    {
        this.contentKind = kind;
        return this;
    }

    public EntryBuilder entryKind(int kind)
    {
        this.entryKind = kind;
        return this;
    }

    public EntryBuilder path(IPath aPath)
    {
        this.path = aPath;
        return this;
    }

    public EntryBuilder outputPath(Path output)
    {
        this.outputPath = output;
        return this;
    }
}