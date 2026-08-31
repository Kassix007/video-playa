.class public final synthetic Le5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB5/a;


# direct methods
.method public synthetic constructor <init>(LB5/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Le5/d;->q:I

    iput-object p1, p0, Le5/d;->r:LB5/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Le5/d;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le5/d;->r:LB5/a;

    .line 7
    .line 8
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :goto_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Le5/d;->r:LB5/a;

    .line 15
    .line 16
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_1
    iget-object v0, p0, Le5/d;->r:LB5/a;

    .line 21
    .line 22
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
