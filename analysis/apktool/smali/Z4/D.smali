.class public final synthetic LZ4/D;
.super Ljava/lang/Object;
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
    iput p2, p0, LZ4/D;->q:I

    iput-object p1, p0, LZ4/D;->r:LB5/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LZ4/D;->q:I

    .line 2
    .line 3
    check-cast p1, Li0/b;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LZ4/D;->r:LB5/a;

    .line 9
    .line 10
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    iget-object p1, p0, LZ4/D;->r:LB5/a;

    .line 17
    .line 18
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
