.class public final LM/h;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LX/e;

.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LX/e;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LM/h;->q:I

    .line 1
    iput-object p1, p0, LM/h;->r:LX/e;

    iput-object p2, p0, LM/h;->t:Ljava/lang/Object;

    iput-object p3, p0, LM/h;->u:Ljava/lang/Object;

    iput-object p4, p0, LM/h;->v:Ljava/lang/Object;

    iput-object p5, p0, LM/h;->w:Ljava/lang/Object;

    iput p6, p0, LM/h;->s:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lc0/m;Lj0/E;LM/e;LM/f;LX/e;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LM/h;->q:I

    .line 2
    iput-object p1, p0, LM/h;->t:Ljava/lang/Object;

    iput-object p2, p0, LM/h;->u:Ljava/lang/Object;

    iput-object p3, p0, LM/h;->v:Ljava/lang/Object;

    iput-object p4, p0, LM/h;->w:Ljava/lang/Object;

    iput-object p5, p0, LM/h;->r:LX/e;

    iput p6, p0, LM/h;->s:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LM/h;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, LP/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget p1, p0, LM/h;->s:I

    .line 15
    .line 16
    invoke-static {p1}, LP/b;->w(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    or-int/lit8 v7, p1, 0x1

    .line 21
    .line 22
    iget-object v1, p0, LM/h;->r:LX/e;

    .line 23
    .line 24
    iget-object v2, p0, LM/h;->t:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v3, p0, LM/h;->u:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v4, p0, LM/h;->v:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v5, p0, LM/h;->w:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v7}, LX/e;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LP/o;I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_0
    move-object v5, p1

    .line 39
    check-cast v5, LP/o;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, LM/h;->t:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v0, p1

    .line 49
    check-cast v0, Lc0/m;

    .line 50
    .line 51
    iget-object p1, p0, LM/h;->u:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v1, p1

    .line 54
    check-cast v1, Lj0/E;

    .line 55
    .line 56
    iget-object p1, p0, LM/h;->v:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v2, p1

    .line 59
    check-cast v2, LM/e;

    .line 60
    .line 61
    iget-object p1, p0, LM/h;->w:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v3, p1

    .line 64
    check-cast v3, LM/f;

    .line 65
    .line 66
    iget p1, p0, LM/h;->s:I

    .line 67
    .line 68
    or-int/lit8 p1, p1, 0x1

    .line 69
    .line 70
    invoke-static {p1}, LP/b;->w(I)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    iget-object v4, p0, LM/h;->r:LX/e;

    .line 75
    .line 76
    invoke-static/range {v0 .. v6}, LM/s0;->b(Lc0/m;Lj0/E;LM/e;LM/f;LX/e;LP/o;I)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 80
    .line 81
    return-object p1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
