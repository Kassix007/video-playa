.class public final Le3/h;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:La3/k;

.field public final synthetic s:LB5/a;

.field public final synthetic t:Lc0/m;

.field public final synthetic u:I


# direct methods
.method public synthetic constructor <init>(La3/k;LB5/a;Lc0/m;III)V
    .locals 0

    .line 1
    iput p6, p0, Le3/h;->q:I

    iput-object p1, p0, Le3/h;->r:La3/k;

    iput-object p2, p0, Le3/h;->s:LB5/a;

    iput-object p3, p0, Le3/h;->t:Lc0/m;

    iput p5, p0, Le3/h;->u:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Le3/h;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v4, p1

    .line 7
    check-cast v4, LP/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    const p1, 0x40000189    # 2.0000937f

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, LP/b;->w(I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    iget p1, p0, Le3/h;->u:I

    .line 22
    .line 23
    invoke-static {p1}, LP/b;->w(I)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    iget-object v1, p0, Le3/h;->r:La3/k;

    .line 28
    .line 29
    iget-object v2, p0, Le3/h;->s:LB5/a;

    .line 30
    .line 31
    iget-object v3, p0, Le3/h;->t:Lc0/m;

    .line 32
    .line 33
    invoke-static/range {v1 .. v6}, LD5/a;->f(La3/k;LB5/a;Lc0/m;LP/o;II)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_0
    move-object v3, p1

    .line 40
    check-cast v3, LP/o;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    const p1, 0x40000189    # 2.0000937f

    .line 48
    .line 49
    .line 50
    invoke-static {p1}, LP/b;->w(I)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    iget p1, p0, Le3/h;->u:I

    .line 55
    .line 56
    invoke-static {p1}, LP/b;->w(I)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    iget-object v0, p0, Le3/h;->r:La3/k;

    .line 61
    .line 62
    iget-object v1, p0, Le3/h;->s:LB5/a;

    .line 63
    .line 64
    iget-object v2, p0, Le3/h;->t:Lc0/m;

    .line 65
    .line 66
    invoke-static/range {v0 .. v5}, LD5/a;->f(La3/k;LB5/a;Lc0/m;LP/o;II)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 70
    .line 71
    return-object p1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
