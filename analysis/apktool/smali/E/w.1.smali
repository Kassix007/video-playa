.class public final LE/w;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:I

.field public final synthetic t:I

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LB5/c;Lc0/m;LB5/c;II)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LE/w;->q:I

    .line 1
    iput-object p1, p0, LE/w;->u:Ljava/lang/Object;

    iput-object p2, p0, LE/w;->r:Ljava/lang/Object;

    iput-object p3, p0, LE/w;->v:Ljava/lang/Object;

    iput p4, p0, LE/w;->s:I

    iput p5, p0, LE/w;->t:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LE/x;Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LE/w;->q:I

    .line 2
    iput-object p1, p0, LE/w;->u:Ljava/lang/Object;

    iput-object p2, p0, LE/w;->r:Ljava/lang/Object;

    iput p3, p0, LE/w;->s:I

    iput-object p4, p0, LE/w;->v:Ljava/lang/Object;

    iput p5, p0, LE/w;->t:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;ILE/H;LX/e;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LE/w;->q:I

    .line 3
    iput-object p1, p0, LE/w;->r:Ljava/lang/Object;

    iput p2, p0, LE/w;->s:I

    iput-object p3, p0, LE/w;->u:Ljava/lang/Object;

    iput-object p4, p0, LE/w;->v:Ljava/lang/Object;

    iput p5, p0, LE/w;->t:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LE/w;->q:I

    .line 2
    .line 3
    move-object v4, p1

    .line 4
    check-cast v4, LP/o;

    .line 5
    .line 6
    check-cast p2, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LE/w;->u:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    check-cast v1, LB5/c;

    .line 18
    .line 19
    iget-object p1, p0, LE/w;->r:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v2, p1

    .line 22
    check-cast v2, Lc0/m;

    .line 23
    .line 24
    iget-object p1, p0, LE/w;->v:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    check-cast v3, LB5/c;

    .line 28
    .line 29
    iget p1, p0, LE/w;->s:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, LP/b;->w(I)I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    iget v6, p0, LE/w;->t:I

    .line 38
    .line 39
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/viewinterop/a;->b(LB5/c;Lc0/m;LB5/c;LP/o;II)V

    .line 40
    .line 41
    .line 42
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_0
    iget-object p1, p0, LE/w;->u:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v2, p1

    .line 48
    check-cast v2, LE/H;

    .line 49
    .line 50
    iget-object p1, p0, LE/w;->v:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v3, p1

    .line 53
    check-cast v3, LX/e;

    .line 54
    .line 55
    iget p1, p0, LE/w;->t:I

    .line 56
    .line 57
    or-int/lit8 p1, p1, 0x1

    .line 58
    .line 59
    invoke-static {p1}, LP/b;->w(I)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    iget-object v0, p0, LE/w;->r:Ljava/lang/Object;

    .line 64
    .line 65
    iget v1, p0, LE/w;->s:I

    .line 66
    .line 67
    invoke-static/range {v0 .. v5}, LE/C;->b(Ljava/lang/Object;ILE/H;LX/e;LP/o;I)V

    .line 68
    .line 69
    .line 70
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 71
    .line 72
    return-object p1

    .line 73
    :pswitch_1
    iget-object p1, p0, LE/w;->u:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v0, p1

    .line 76
    check-cast v0, LE/x;

    .line 77
    .line 78
    iget p1, p0, LE/w;->t:I

    .line 79
    .line 80
    or-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    invoke-static {p1}, LP/b;->w(I)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    iget-object v1, p0, LE/w;->r:Ljava/lang/Object;

    .line 87
    .line 88
    iget v2, p0, LE/w;->s:I

    .line 89
    .line 90
    iget-object v3, p0, LE/w;->v:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static/range {v0 .. v5}, LE/C;->d(LE/x;Ljava/lang/Object;ILjava/lang/Object;LP/o;I)V

    .line 93
    .line 94
    .line 95
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 96
    .line 97
    return-object p1

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
