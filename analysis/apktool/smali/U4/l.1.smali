.class public final LU4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LU4/l;->q:I

    iput-object p2, p0, LU4/l;->r:Ljava/lang/Object;

    iput-object p3, p0, LU4/l;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lv0/o;Lq5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LU4/l;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU4/l;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La5/c;

    .line 9
    .line 10
    iget-object v1, p0, LU4/l;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LB5/c;

    .line 13
    .line 14
    new-instance v2, LN5/d;

    .line 15
    .line 16
    const/16 v3, 0x9

    .line 17
    .line 18
    invoke-direct {v2, v3, v0, v1}, LN5/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x7

    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {p1, v1, v2, p2, v0}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 28
    .line 29
    if-ne p1, p2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 33
    .line 34
    :goto_0
    return-object p1

    .line 35
    :pswitch_0
    iget-object v0, p0, LU4/l;->r:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, LP/W;

    .line 38
    .line 39
    iget-object v1, p0, LU4/l;->s:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, LP/W;

    .line 42
    .line 43
    new-instance v2, LU4/i;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-direct {v2, v0, v1, v3}, LU4/i;-><init>(LP/W;LP/W;I)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x7

    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-static {p1, v1, v2, p2, v0}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 56
    .line 57
    if-ne p1, p2, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 61
    .line 62
    :goto_1
    return-object p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
