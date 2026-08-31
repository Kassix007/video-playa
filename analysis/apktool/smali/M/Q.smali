.class public final LM/Q;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB5/a;


# direct methods
.method public synthetic constructor <init>(LB5/a;I)V
    .locals 0

    .line 1
    iput p2, p0, LM/Q;->q:I

    iput-object p1, p0, LM/Q;->r:LB5/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LM/Q;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    iget-object v2, p0, LM/Q;->r:LB5/a;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, LI0/i;

    .line 11
    .line 12
    new-instance v0, LI0/e;

    .line 13
    .line 14
    invoke-interface {v2}, LB5/a;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    new-instance v3, LG5/a;

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    const/high16 v5, 0x3f800000    # 1.0f

    .line 28
    .line 29
    invoke-direct {v3, v4, v5}, LG5/a;-><init>(FF)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v2, v3}, LI0/e;-><init>(FLG5/a;)V

    .line 33
    .line 34
    .line 35
    sget-object v2, LI0/r;->a:[LH5/k;

    .line 36
    .line 37
    sget-object v2, LI0/p;->c:LI0/s;

    .line 38
    .line 39
    sget-object v3, LI0/r;->a:[LH5/k;

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    aget-object v3, v3, v4

    .line 43
    .line 44
    invoke-virtual {v2, p1, v0}, LI0/s;->a(LI0/i;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_0
    check-cast p1, Li0/b;

    .line 49
    .line 50
    iget-wide v3, p1, Li0/b;->a:J

    .line 51
    .line 52
    invoke-interface {v2}, LB5/a;->invoke()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 57
    .line 58
    invoke-interface {v2}, LB5/a;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
