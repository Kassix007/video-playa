.class public final synthetic LR4/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LR4/O;


# direct methods
.method public synthetic constructor <init>(LR4/O;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, LR4/M;->q:I

    iput-object p1, p0, LR4/M;->r:LR4/O;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, LR4/M;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/M;->r:LR4/O;

    .line 7
    .line 8
    iget-object v0, v0, LR4/O;->h:LR4/V;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, LR4/M;->r:LR4/O;

    .line 15
    .line 16
    iget-object v0, v0, LR4/O;->h:LR4/V;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
