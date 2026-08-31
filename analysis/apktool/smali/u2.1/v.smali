.class public abstract Lu2/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP/T0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR4/b2;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, LR4/b2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LP/T0;

    .line 9
    .line 10
    invoke-direct {v1, v0}, LP/l0;-><init>(LB5/a;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lu2/v;->a:LP/T0;

    .line 14
    .line 15
    return-void
.end method
