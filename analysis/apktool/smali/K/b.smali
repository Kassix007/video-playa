.class public abstract LK/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, LK/a;->r:LK/a;

    .line 2
    .line 3
    new-instance v1, LP/z;

    .line 4
    .line 5
    invoke-direct {v1, v0}, LP/z;-><init>(LB5/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, LK/b;->a:LP/z;

    .line 9
    .line 10
    return-void
.end method
