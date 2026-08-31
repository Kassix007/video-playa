.class public final LD/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/x;


# instance fields
.field public final a:LD/y;

.field public final b:LD/h;

.field public final c:LE/Y;


# direct methods
.method public constructor <init>(LD/y;LD/h;LE/Y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LD/i;->a:LD/y;

    .line 5
    .line 6
    iput-object p2, p0, LD/i;->b:LD/h;

    .line 7
    .line 8
    iput-object p3, p0, LD/i;->c:LE/Y;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/i;->b:LD/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LD/h;->k()LE/Y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, LE/Y;->b:I

    .line 8
    .line 9
    return v0
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LD/i;->c:LE/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE/Y;->h(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LD/i;->b:LD/h;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LE/C;->l(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    return-object v0
.end method

.method public final c(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LD/i;->b:LD/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE/C;->j(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final d(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, LD/i;->c:LE/Y;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LE/Y;->g(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final e(ILP/o;Ljava/lang/Object;)V
    .locals 7

    .line 1
    const v0, 0x5905c824

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LP/o;->S(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LD/i;->a:LD/y;

    .line 8
    .line 9
    iget-object v3, v0, LD/y;->q:LE/H;

    .line 10
    .line 11
    new-instance v0, LA/k;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, p1, v1, p0}, LA/k;-><init>(IILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const v1, 0x2b48c518

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v0, p2}, LX/k;->d(ILm5/e;LP/o;)LX/e;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/16 v6, 0xc00

    .line 25
    .line 26
    move v2, p1

    .line 27
    move-object v5, p2

    .line 28
    move-object v1, p3

    .line 29
    invoke-static/range {v1 .. v6}, LE/C;->b(Ljava/lang/Object;ILE/H;LX/e;LP/o;I)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    invoke-virtual {v5, p1}, LP/o;->p(Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LD/i;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LD/i;

    .line 12
    .line 13
    iget-object p1, p1, LD/i;->b:LD/h;

    .line 14
    .line 15
    iget-object v0, p0, LD/i;->b:LD/h;

    .line 16
    .line 17
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LD/i;->b:LD/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
