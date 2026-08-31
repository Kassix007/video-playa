.class public final Lc3/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/a;
.implements Lc3/d;


# instance fields
.field public final a:La3/y;

.field public final b:Ld3/e;

.field public c:Li3/l;


# direct methods
.method public constructor <init>(La3/y;Lj3/b;Li3/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc3/r;->a:La3/y;

    .line 5
    .line 6
    iget-object p1, p3, Li3/k;->a:Lh3/e;

    .line 7
    .line 8
    invoke-interface {p1}, Lh3/e;->f()Ld3/e;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lc3/r;->b:Ld3/e;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Lj3/b;->d(Ld3/e;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ld3/e;->a(Ld3/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static d(II)I
    .locals 2

    .line 1
    div-int v0, p0, p1

    .line 2
    .line 3
    xor-int v1, p0, p1

    .line 4
    .line 5
    if-gez v1, :cond_0

    .line 6
    .line 7
    mul-int v1, v0, p1

    .line 8
    .line 9
    if-eq v1, p0, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :cond_0
    mul-int/2addr v0, p1

    .line 14
    sub-int/2addr p0, v0

    .line 15
    return p0
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/r;->a:La3/y;

    .line 2
    .line 3
    invoke-virtual {v0}, La3/y;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method
