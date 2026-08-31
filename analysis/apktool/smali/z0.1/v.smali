.class public final Lz0/v;
.super LB0/H;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lz0/y;

.field public final synthetic b:LB5/e;


# direct methods
.method public constructor <init>(Lz0/y;LB5/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/v;->a:Lz0/y;

    .line 5
    .line 6
    iput-object p2, p0, Lz0/v;->b:LB5/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LB0/T;Ljava/util/List;J)Lz0/D;
    .locals 6

    .line 1
    iget-object v2, p0, Lz0/v;->a:Lz0/y;

    .line 2
    .line 3
    iget-object p2, v2, Lz0/y;->x:Lz0/t;

    .line 4
    .line 5
    invoke-interface {p1}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p2, Lz0/t;->q:LW0/l;

    .line 10
    .line 11
    invoke-interface {p1}, LW0/c;->b()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p2, Lz0/t;->r:F

    .line 16
    .line 17
    invoke-interface {p1}, LW0/c;->l()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p2, Lz0/t;->s:F

    .line 22
    .line 23
    invoke-interface {p1}, Lz0/E;->r()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v0, p0, Lz0/v;->b:LB5/e;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    iget-object p1, v2, Lz0/y;->q:LB0/L;

    .line 33
    .line 34
    iget-object p1, p1, LB0/L;->x:LB0/L;

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iput v1, v2, Lz0/y;->u:I

    .line 39
    .line 40
    iget-object p1, v2, Lz0/y;->y:Lz0/q;

    .line 41
    .line 42
    new-instance p2, LW0/a;

    .line 43
    .line 44
    invoke-direct {p2, p3, p4}, LW0/a;-><init>(J)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, p1, p2}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    move-object v1, p1

    .line 52
    check-cast v1, Lz0/D;

    .line 53
    .line 54
    iget v3, v2, Lz0/y;->u:I

    .line 55
    .line 56
    new-instance v0, Lz0/u;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    move-object v4, v1

    .line 60
    invoke-direct/range {v0 .. v5}, Lz0/u;-><init>(Lz0/D;Lz0/y;ILz0/D;I)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_0
    iput v1, v2, Lz0/y;->t:I

    .line 65
    .line 66
    new-instance p1, LW0/a;

    .line 67
    .line 68
    invoke-direct {p1, p3, p4}, LW0/a;-><init>(J)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, p2, p1}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    move-object v1, p1

    .line 76
    check-cast v1, Lz0/D;

    .line 77
    .line 78
    iget v3, v2, Lz0/y;->t:I

    .line 79
    .line 80
    new-instance v0, Lz0/u;

    .line 81
    .line 82
    const/4 v5, 0x1

    .line 83
    move-object v4, v1

    .line 84
    invoke-direct/range {v0 .. v5}, Lz0/u;-><init>(Lz0/D;Lz0/y;ILz0/D;I)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method
