.class public abstract Lp3/y;
.super Lp3/X;
.source "SourceFile"

# interfaces
.implements Lp3/A;
.implements Lp3/U;


# instance fields
.field public i:Ljava/util/HashSet;

.field public j:Ljava/lang/String;

.field public k:Ljava/util/HashSet;

.field public l:Ljava/util/HashSet;

.field public m:Ljava/util/HashSet;

.field public n:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lp3/X;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lp3/y;->i:Ljava/util/HashSet;

    .line 6
    .line 7
    iput-object v0, p0, Lp3/y;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lp3/y;->k:Ljava/util/HashSet;

    .line 10
    .line 11
    iput-object v0, p0, Lp3/y;->l:Ljava/util/HashSet;

    .line 12
    .line 13
    iput-object v0, p0, Lp3/y;->m:Ljava/util/HashSet;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/y;->i:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Ljava/util/HashSet;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/y;->m:Ljava/util/HashSet;

    .line 2
    .line 3
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/y;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final d(Ljava/util/HashSet;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/y;->l:Ljava/util/HashSet;

    .line 2
    .line 3
    return-void
.end method

.method public final e(Ljava/util/HashSet;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/y;->k:Ljava/util/HashSet;

    .line 2
    .line 3
    return-void
.end method

.method public final g(Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/y;->n:Landroid/graphics/Matrix;

    .line 2
    .line 3
    return-void
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/y;->k:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/y;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l(Ljava/util/HashSet;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp3/y;->i:Ljava/util/HashSet;

    .line 2
    .line 3
    return-void
.end method

.method public final m()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/y;->l:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lp3/y;->m:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method
