.class public final LE/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LZ/c;

.field public final b:LC/j;

.field public final c:Lr/G;


# direct methods
.method public constructor <init>(LZ/c;LC/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/u;->a:LZ/c;

    .line 5
    .line 6
    iput-object p2, p0, LE/u;->b:LC/j;

    .line 7
    .line 8
    sget-object p1, Lr/O;->a:[J

    .line 9
    .line 10
    new-instance p1, Lr/G;

    .line 11
    .line 12
    invoke-direct {p1}, Lr/G;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LE/u;->c:Lr/G;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;Ljava/lang/Object;)LB5/e;
    .locals 5

    .line 1
    iget-object v0, p0, LE/u;->c:Lr/G;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LE/t;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const v3, 0x53af4291

    .line 11
    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget v4, v1, LE/t;->c:I

    .line 16
    .line 17
    if-ne v4, p1, :cond_1

    .line 18
    .line 19
    iget-object v4, v1, LE/t;->b:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v4, p3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    iget-object p1, v1, LE/t;->d:LX/e;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, LB0/j0;

    .line 32
    .line 33
    iget-object p2, v1, LE/t;->e:LE/u;

    .line 34
    .line 35
    const/4 p3, 0x3

    .line 36
    invoke-direct {p1, p3, p2, v1}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance p2, LX/e;

    .line 40
    .line 41
    invoke-direct {p2, v3, v2, p1}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, v1, LE/t;->d:LX/e;

    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_0
    return-object p1

    .line 48
    :cond_1
    new-instance v1, LE/t;

    .line 49
    .line 50
    invoke-direct {v1, p0, p1, p2, p3}, LE/t;-><init>(LE/u;ILjava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p2, v1}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, v1, LE/t;->d:LX/e;

    .line 57
    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    new-instance p1, LB0/j0;

    .line 61
    .line 62
    const/4 p2, 0x3

    .line 63
    invoke-direct {p1, p2, p0, v1}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance p2, LX/e;

    .line 67
    .line 68
    invoke-direct {p2, v3, v2, p1}, LX/e;-><init>(IZLjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object p2, v1, LE/t;->d:LX/e;

    .line 72
    .line 73
    return-object p2

    .line 74
    :cond_2
    return-object p1
.end method

.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LE/u;->c:Lr/G;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, LE/t;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p1, v0, LE/t;->b:Ljava/lang/Object;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    iget-object v0, p0, LE/u;->b:LC/j;

    .line 18
    .line 19
    invoke-virtual {v0}, LC/j;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, LE/x;

    .line 24
    .line 25
    invoke-interface {v0, p1}, LE/x;->d(Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/4 v1, -0x1

    .line 30
    if-eq p1, v1, :cond_2

    .line 31
    .line 32
    invoke-interface {v0, p1}, LE/x;->c(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 38
    return-object p1
.end method
