.class public final LP5/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP5/L;

.field public static final b:LP5/L;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP5/L;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LP5/L;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LP5/K;->a:LP5/L;

    .line 8
    .line 9
    new-instance v0, LP5/L;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, LP5/L;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, LP5/K;->b:LP5/L;

    .line 16
    .line 17
    return-void
.end method
