.class public final LZ4/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB5/a;


# direct methods
.method public synthetic constructor <init>(LB5/a;I)V
    .locals 0

    .line 1
    iput p2, p0, LZ4/E;->q:I

    iput-object p1, p0, LZ4/E;->r:LB5/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Lv0/o;Lq5/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LZ4/E;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LZ4/D;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iget-object v2, p0, LZ4/E;->r:LB5/a;

    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, LZ4/D;-><init>(LB5/a;I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x7

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p1, v2, v0, p2, v1}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 21
    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 26
    .line 27
    :goto_0
    return-object p1

    .line 28
    :pswitch_0
    new-instance v0, LZ4/D;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    iget-object v2, p0, LZ4/E;->r:LB5/a;

    .line 32
    .line 33
    invoke-direct {v0, v2, v1}, LZ4/D;-><init>(LB5/a;I)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x7

    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-static {p1, v2, v0, p2, v1}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 43
    .line 44
    if-ne p1, p2, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 48
    .line 49
    :goto_1
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
