.class public final synthetic LY4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LY4/d;


# direct methods
.method public synthetic constructor <init>(LY4/d;I)V
    .locals 0

    .line 1
    iput p2, p0, LY4/a;->q:I

    iput-object p1, p0, LY4/a;->r:LY4/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget p1, p0, LY4/a;->q:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LY4/a;->r:LY4/d;

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    iput-boolean p2, p1, LY4/d;->i:Z

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p1, p0, LY4/a;->r:LY4/d;

    .line 13
    .line 14
    iget-object p1, p1, LY4/d;->g:Ly4/e;

    .line 15
    .line 16
    invoke-virtual {p1}, Ly4/e;->a()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
