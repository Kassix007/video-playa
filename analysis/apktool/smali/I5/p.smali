.class public final LI5/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI5/i;


# instance fields
.field public final synthetic a:I

.field public final b:LI5/i;

.field public final c:LB5/c;


# direct methods
.method public synthetic constructor <init>(LI5/i;LB5/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LI5/p;->a:I

    iput-object p1, p0, LI5/p;->b:LI5/i;

    iput-object p2, p0, LI5/p;->c:LB5/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, LI5/p;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LI5/q;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LI5/q;-><init>(LI5/p;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, LI5/f;

    .line 13
    .line 14
    invoke-direct {v0, p0}, LI5/f;-><init>(LI5/p;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
